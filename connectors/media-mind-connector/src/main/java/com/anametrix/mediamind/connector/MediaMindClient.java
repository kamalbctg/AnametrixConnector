package com.anametrix.mediamind.connector;

import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.axis2.AxisFault;

import com.anametrix.connector.exception.ConnectorException;
import com.anametrix.mediamind.handler.AdHandler;
import com.anametrix.mediamind.handler.AdvertiserHandler;
import com.anametrix.mediamind.handler.AnalyticsDataServiceHandler;
import com.anametrix.mediamind.handler.AuthenticationHandler;
import com.anametrix.mediamind.handler.CampaignHandler;
import com.anametrix.mediamind.handler.PlacementHandler;
import com.anametrix.mediamind.model.AdPerformanceReport;
import com.anametrix.mediamind.model.AdPerformanceReportRow;
import com.anametrix.mediamind.model.PlacementPerformanceReport;
import com.eyeblaster.api.v1.datacontracts.ad.AdInfo;
import com.eyeblaster.api.v1.datacontracts.advertiser.AdvertiserInfo;
import com.eyeblaster.api.v1.datacontracts.campaign.CampaignInfo;
import com.eyeblaster.api.v1.datacontracts.placement.PlacementInfo;


public class MediaMindClient {
	
	private String securityToken;
	private CampaignHandler campaignHandler;
	private AdHandler adHandler;
	private PlacementHandler placementHandler;
	
	public String getSecurityToken() {
		return securityToken;
	}


	public void login(String userName, String password, String apiKey)
			throws ConnectorException {
		try {
			AuthenticationHandler handler = new AuthenticationHandler();
			handler.Login(userName, password, apiKey);
			securityToken = handler.getSecurityToken();
		} catch (AxisFault e) {
			if (e.getCause() instanceof UnknownHostException) {
				throw new ConnectorException("Connection error");
			} else {
				throw new ConnectorException(e.getMessage());
			}
		} catch (RemoteException e) {
			if (e.getCause() instanceof UnknownHostException) {
				throw new ConnectorException("Connection error");
			} else {
				throw new ConnectorException(e.getMessage());
			}
		}

	}

	public List<Map<String,Object>> getData(Date date, Map<String, String> configuration)
			throws ConnectorException {
		List<Map<String,Object>> dataList = new ArrayList<Map<String,Object>>();	
		try {
			if (configuration.isEmpty()) {
				throw new ConnectorException("Invalid Configuration");
			}
			
			
			
			Date reportStartDate = Utils.initiateCurrentDateToZeroHour(date);			
			Date reportEndDate = date;			
			int cookieWindowClicks = Integer.parseInt(configuration.get(ConfigurationParam.cookieWindowClicks));
			int cookieWindowImpressions = Integer.parseInt(configuration.get(ConfigurationParam.cookieWindowImpressions));
			int conversionAttributionModel = Integer.parseInt(configuration.get(ConfigurationParam.conversionAttributionModel));
			
			
			AdvertiserHandler advertiserHandler = new AdvertiserHandler(securityToken);
			
			AdvertiserInfo[] avAdvertiserInfos = advertiserHandler.getAdvertisers(false);
			
			for(AdvertiserInfo advertiserInfo : avAdvertiserInfos){
				
					CampaignInfo[] campaignInfos = campaignHandler.getCampaignsByAdvertiser(advertiserInfo.getID(), true);
					
					for(CampaignInfo campaignInfo : campaignInfos){
						
					int campaignId = campaignInfo.getID();					
	
					AnalyticsDataServiceHandler handler = new AnalyticsDataServiceHandler(securityToken);
					campaignHandler = new CampaignHandler(securityToken);
					adHandler = new AdHandler(securityToken);
					placementHandler = new PlacementHandler(securityToken);
					
					
					AdPerformanceReport adReport = (AdPerformanceReport) handler.getReport(reportStartDate, reportEndDate,campaignId,cookieWindowClicks,cookieWindowImpressions,conversionAttributionModel,8,AdPerformanceReport.class);
					
				//PlacementPerformanceReport placementReport = (PlacementPerformanceReport) handler.getReport(reportStartDate, reportEndDate,campaignId,cookieWindowClicks,cookieWindowImpressions,conversionAttributionModel,16,PlacementPerformanceReport.class);
				
					for(AdPerformanceReportRow row : adReport.getDataRowList()){
						Map<String,Object> tmp = new HashMap<String, Object>();
						//CampaignInfo campaignInfo = campaignHandler.getCampaignById(row.getCampaignID());
						AdInfo adInfo = adHandler.getAdById(row.getAdID());
						PlacementInfo placementInfo = placementHandler.getPlacementById(row.getPlacementID(), true);
						tmp.put(DataBaseColumns.date, new Date());
						tmp.put(DataBaseColumns.campaign_id, row.getCampaignID());
						tmp.put(DataBaseColumns.campaign_name, campaignInfo.getName());
						tmp.put(DataBaseColumns.ad_id,row.getAdID());
						tmp.put(DataBaseColumns.ad_name,adInfo.getAdName());
						tmp.put(DataBaseColumns.site_id, row.getSiteID());
						tmp.put(DataBaseColumns.site_name,adInfo.getAdExtendedInfo().getSiteName());
						tmp.put(DataBaseColumns.placement_id, row.getPlacementID());
						tmp.put(DataBaseColumns.placement_name, placementInfo.getPlacementName());
						tmp.put(DataBaseColumns.clicks, row.getClicks());
						tmp.put(DataBaseColumns.served_impressions, row.getImpressions());
						tmp.put(DataBaseColumns.interactions, row.getTotalInteractions());
						tmp.put(DataBaseColumns.dwell_average_duration, row.getAvgDwellTime());
						tmp.put(DataBaseColumns.impressions_with_Dwell, row.getImpressionsWithDwell());
						tmp.put(DataBaseColumns.total_conversions, row.getTotalConversion());
						tmp.put(DataBaseColumns.total_revenue, row.getTotalRevenue());
						tmp.put(DataBaseColumns.placement_classification1, placementInfo.getPlacementClassification1());
						tmp.put(DataBaseColumns.placement_classification2, placementInfo.getPlacementClassification2());
						tmp.put(DataBaseColumns.placement_classification3, placementInfo.getPlacementClassification3());
						tmp.put(DataBaseColumns.click_through_url, adInfo.getClickthroughUrl());
						dataList.add(tmp);
					}
				}
			}
		} catch (AxisFault e) {
			if (e.getCause() instanceof UnknownHostException) {
				throw new ConnectorException("Connection error");
			} else {
				throw new ConnectorException(e.getMessage());
			}
		} catch (RemoteException e) {
			if (e.getCause() instanceof UnknownHostException) {
				throw new ConnectorException("Connection error");
			} else {
				throw new ConnectorException(e.getMessage());
			}
		} 

		return dataList;
	}
	

}
