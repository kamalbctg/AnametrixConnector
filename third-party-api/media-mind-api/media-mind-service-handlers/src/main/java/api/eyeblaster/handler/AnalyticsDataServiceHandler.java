package api.eyeblaster.handler;

import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;

import api.eyeblaster.com.analytics.AnalyticsDataServiceStub;
import api.eyeblaster.commons.AxisOption;

import com.eyeblaster.api.message.analytics.DeleteAnalyticsReportRequest;
import com.eyeblaster.api.message.analytics.GetAnalyticsReportAsURLRequest;
import com.eyeblaster.api.message.analytics.GetAnalyticsReportAsURLResponse;
import com.eyeblaster.api.message.analytics.GetAnalyticsReportJobStatusRequest;
import com.eyeblaster.api.message.analytics.GetAnalyticsReportJobStatusResponse;
import com.eyeblaster.api.message.analytics.InitiateAnalyticsReportJobRequest;
import com.eyeblaster.api.message.analytics.InitiateAnalyticsReportJobResponse;
import com.eyeblaster.api.message.analytics.UserSecurityToken;
import com.eyeblaster.api.v1.datacontracts.analytics.APIDateTime;
import com.eyeblaster.api.v1.datacontracts.analytics.PerformanceReport;
import com.eyeblaster.api.v2.datacontracts.analytics.JobStatus;

public class AnalyticsDataServiceHandler {
	private AnalyticsDataServiceStub stub;
	private String securityToken;
	
	public AnalyticsDataServiceHandler(String token) throws RemoteException {
		stub = new AnalyticsDataServiceStub();
		AxisOption.setOption(stub);	
		this.securityToken = token;
	}
	
	private APIDateTime convertTOAPIDate(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		APIDateTime  apiDate = new APIDateTime();
		apiDate.setDay(calendar.get(Calendar.DAY_OF_MONTH));
		apiDate.setMonth(calendar.get(Calendar.MONTH)+1);
		apiDate.setYear(calendar.get(Calendar.YEAR));
		
		return apiDate;
	}
	
	public api.eyeblaster.model.PerformanceReport getReport(Date reportStartDate,Date reportEndDate,int campaingId,int cookieWindowClicks,
			int cookieWindowImpressions,int conversionAttributionModel,
			int dataLevelID) throws RemoteException  {
		
		try{
			PerformanceReport report = new PerformanceReport();

			report.setCampaignID(campaingId);
			report.setReportStartDate(convertTOAPIDate(reportStartDate));
			report.setReporEndtDate(convertTOAPIDate(reportEndDate));
			report.setCookieWindowClicks(cookieWindowClicks);
			report.setCookieWindowImpressions(cookieWindowImpressions);
			report.setConversionAttributionModel(conversionAttributionModel);
			report.setDataLevelID(dataLevelID);
			report.setIsIgnoreAssignmentToCampaign(true);
			report.setUniqueName("" + new Date().getTime());

			InitiateAnalyticsReportJobRequest initReq = new InitiateAnalyticsReportJobRequest();
			initReq.setAnalyticsReport(report);

			InitiateAnalyticsReportJobResponse initRes = stub.InitiateReportJob(initReq, createSecurityToken());

			GetAnalyticsReportJobStatusRequest jobStatusReq = new GetAnalyticsReportJobStatusRequest();
			jobStatusReq.setAnalyticsReport(initRes.getAnalyticsReport());

			GetAnalyticsReportJobStatusResponse jobStatusRes = stub.GetReportJobStatus(jobStatusReq, createSecurityToken());

			JobStatus status = jobStatusRes.getStatus();

			while (status != JobStatus.value1)

			{
				
				GetAnalyticsReportJobStatusResponse tmp = stub.GetReportJobStatus(jobStatusReq, createSecurityToken());
				status = tmp.getStatus();
				if("failed".equals(status.getValue().toLowerCase())){
					throw new RemoteException("Filed to get report");
				}
			}

			GetAnalyticsReportAsURLRequest urlReq = new GetAnalyticsReportAsURLRequest();
			urlReq.setAnalyticsReport(initRes.getAnalyticsReport());

			GetAnalyticsReportAsURLResponse res3 = stub.GetReportAsURL(urlReq,createSecurityToken());
			System.out.println(res3.getURL());
			HttpClient client = new HttpClient();
			HttpMethod method = new GetMethod(res3.getURL());
			int response = client.executeMethod(method);

			JAXBContext jc = JAXBContext.newInstance(api.eyeblaster.model.PerformanceReport.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			InputStream inputStream = method.getResponseBodyAsStream();
			
//			DeleteAnalyticsReportRequest deleteReq = new DeleteAnalyticsReportRequest();
//			deleteReq.setAnalyticsReport(report);
//			stub.DeleteReport(deleteReq, createSecurityToken());
			
			return (api.eyeblaster.model.PerformanceReport) unmarshaller.unmarshal(inputStream);
			

		} catch (HttpException e) {
			throw new RemoteException("http error");
		} catch (IOException e) {
			throw new RemoteException("IO exception");
		} catch (JAXBException e) {
			throw new RemoteException("unmarshaller exception");
		}
		
	}


	private UserSecurityToken createSecurityToken(){
		UserSecurityToken securityToken = new UserSecurityToken();
		securityToken.setUserSecurityToken(this.securityToken);		
		return securityToken;
	}
}
