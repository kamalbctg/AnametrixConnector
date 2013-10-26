package api.eyeblaster.handler;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.eyeblaster.api.v1.datacontracts.analytics.PerformanceReport;

public class AnalyticsDataServiceHandlerTest {
	private String securityToken ;
	
	@Before
	public void init() throws RemoteException {
		AuthenticationHandler authHandler = new AuthenticationHandler();
		authHandler.Login("22SQ.API", "Password01","1a8a4001-9a02-4298-a70c-d72375b82976");
		securityToken = authHandler.getSecurityToken();
	}
	
	@Test
	public void testAnalyticsReport() throws RemoteException, ParseException  {
		AnalyticsDataServiceHandler handler = new AnalyticsDataServiceHandler(securityToken);
		
		SimpleDateFormat fdt = new SimpleDateFormat("MM/dd/yyyy");
		
		Date reportStartDate = fdt.parse("03/14/2011");
		Date reportEndDate = fdt.parse("03/30/2011");
		
		api.eyeblaster.model.PerformanceReport report = handler.getReport(reportStartDate, reportEndDate, 30408, 1, 1, 1, 8);		
		System.out.println(report.getDataRowList());
	}
}
