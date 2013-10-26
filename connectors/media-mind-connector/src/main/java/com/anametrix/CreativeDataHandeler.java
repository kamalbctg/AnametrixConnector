package com.anametrix;
//
//import java.rmi.RemoteException;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import com.anametrix.connector.exception.ApplicationException;
//import com.anametrix.mediamind.AdsHandler;
//import com.anametrix.mediamind.AnalyticsDataServiceHandler;
//import com.anametrix.mediamind.SmartVersioningHandler;
//import com.anametrix.mediamind.connector.CreativeColumns;
//import com.eyeblaster.api.message.UserSecurityToken;
//import com.eyeblaster.api.v1.datacontracts.APIDateTime;
//import com.eyeblaster.api.v1.datacontracts.AdInfo;
//import com.eyeblaster.api.v1.datacontracts.AdInteractionInfo;
//import com.eyeblaster.api.v1.datacontracts.SmartVersioningType;
//import com.xml.DataRow;
//import com.xml.PerformanceReport;
//
//
//public class CreativeDataHandeler {
//	private AnalyticsDataServiceHandler analyticsDataServiceHandler;
//	private AdsHandler adHandler;
//	private SmartVersioningHandler smartVersioningHandler;
//	
//	public CreativeDataHandeler() throws RemoteException {
//		analyticsDataServiceHandler = new AnalyticsDataServiceHandler();
//		adHandler = new AdsHandler();
//		smartVersioningHandler = new SmartVersioningHandler();
//	}
//	
//	public void loadData(UserSecurityToken token,Date startDate,Date endDate,int campaignId) throws ApplicationException, RemoteException{
//		
//		APIDateTime reportStartDate = new APIDateTime();		
//		reportStartDate.setYear(2011);
//		reportStartDate.setMonth(03);
//		reportStartDate.setDay(14);
//		
//		APIDateTime reportEndDate = new APIDateTime();     
//		reportEndDate.setYear(2012);
//		reportEndDate.setMonth(12);
//		reportEndDate.setDay(31);
//
//		PerformanceReport report = analyticsDataServiceHandler.getReport(reportStartDate, reportEndDate, campaignId,9,10,3,8,token);
//		List<Map<String,Object>> dataList = new ArrayList<Map<String,Object>>();
//		
//		for(DataRow row : report.getDataRowList()){
//			Map<String,Object> tmp = new HashMap<String, Object>();
//			AdInfo adinfo = adHandler.getAdById(token, row.getAdID());
//			AdInteractionInfo[] interactions = adHandler.getAdInteraction(row.getAdID(), token);
//			//SmartVersioningType smartVersioningType =  smartVersioningHandler.getSmartVersion(row.getAdID(), token);
//			
//			if(interactions !=null){
//				for(AdInteractionInfo tmpInfo :interactions){
//					genarateMap(row, tmp, adinfo,tmpInfo);
//				}
//				
//			}else{
//				genarateMap(row, tmp, adinfo,null);				
//			}
//
//			
//			//tmp.put(CreativeColumns.ad_average_duration, row.)
//		}
//		
//	}
//
//	private void genarateMap(DataRow row, Map<String, Object> tmp, AdInfo adinfo,AdInteractionInfo interactionInfo) {
//		tmp.put(CreativeColumns.site_name, adinfo.getAdExtendedInfo().getSiteName());
//		tmp.put(CreativeColumns.placement_id, row.getPlacementID());
//		tmp.put(CreativeColumns.placement_name, adinfo.getAdExtendedInfo().getPlacementName());			
//		tmp.put(CreativeColumns.section_name, adinfo.getAdExtendedInfo().getSectionName());
//		tmp.put(CreativeColumns.campaign_name, adinfo.getAdExtendedInfo().getCampaignName());			
//		tmp.put(CreativeColumns.ad_id, row.getAdID());
//		tmp.put(CreativeColumns.ad_name, adinfo.getAdName());
//		
//		if(interactionInfo != null){
//			tmp.put(CreativeColumns.interaction_name, interactionInfo.getInteractionName());
//			tmp.put(CreativeColumns.interaction_type, interactionInfo.getClass().getName());			
//		}
//		
//		tmp.put(CreativeColumns.smart_version, (adinfo.getIsSmartAd()) ? "Y" :"N");
//		tmp.put(CreativeColumns.smart_version_group, adinfo.getSmartVersioningGroupName());
//		tmp.put(CreativeColumns.media_impressions, row.getImpressions());
//		tmp.put(CreativeColumns.custom_interaction_average_duration, row.getImpressionsWithDwell());
//		tmp.put(CreativeColumns.ad_interactions, row.getTotalInteractions());
//		tmp.put(CreativeColumns.dwell_average_duration, row.getAvgDwellTime());
//		tmp.put(CreativeColumns.total_interactions, row.getTotalInteractions());
//		
//		//tmp.put(CreativeColumns.initiated_expansions, row.)
//		
//	}
//	
//
////	/*
////	 * Load data by retrieving placements 
////	 * paging is mandatory 
////	 * */
////	public ArrayList<Map>  loadCreativeDataByPlacement(Map<String, String> configuration,UserSecurityToken token ) throws RemoteException {
////		
////		
////		PlacementHandler placementHandler = new PlacementHandler();
////		AdsHandler adsHandler = new AdsHandler();
////		SmartVersioningHandler smartVersionHandler = new SmartVersioningHandler();
////		
////		int pageIndex = (configuration.containsKey(ConnectorConstants.PAGEINDEX)) ? Integer.parseInt(configuration.get(ConnectorConstants.PAGEINDEX)) : 0;
////		int pageSize =  (configuration.containsKey(ConnectorConstants.PAGESIZE)) ? Integer.parseInt(configuration.get(ConnectorConstants.PAGESIZE)) : 0;
////		
////		// need paging info as media mind is sending fault but there doc is saying paging is none
////		ListPaging pListPaging = new ListPaging();			
////		pListPaging.setPageIndex(pageIndex);
////		pListPaging.setPageSize(pageSize);
////		
////		//create placement payload
////		GetPlacementsRequest req = new GetPlacementsRequest();
////		req.setPaging(pListPaging);
////		req.setShowPlacementExtendedInfo(true);
////		
////
////		
////	
////		ArrayList<Map> list = new ArrayList<Map>();
////		PlacementInfo[] arrInfo = placementHandler.loadPlacements(pListPaging,token);		
////		
////		for (PlacementInfo info : arrInfo) {
////
////			AdInfo[] adInfoArr = adsHandler.getAllAdsByPlacement(info.getID(),token);
////
////			if (adInfoArr != null) {
////				for (AdInfo adInfo : adInfoArr) {
////					AdInteractionInfo[] interactionnfo = adsHandler.getAdInteraction(adInfo.getID(), token);
////					if (interactionnfo != null) {
////						for (AdInteractionInfo interaction : interactionnfo) {
////							list.add(createDataMap(smartVersionHandler, token, info,	adInfo, interaction));
////						}
////
////					} else {
////						list.add(createDataMap(smartVersionHandler, token, info,	adInfo, null));
////					}
////				}
////			} else {
////				list.add(createDataMap(smartVersionHandler, token, info,	null, null));
////			}
////		}
////
////				
////		return list;
////	}
////
////	
////	private Map<String,Object> createDataMap(SmartVersioningHandler smartVersionHandler,UserSecurityToken token, PlacementInfo info, AdInfo adInfo,AdInteractionInfo interaction) {
////		Map<String,Object> dataMap = new HashMap<String, Object>();
////		dataMap.put(CreativeColumns.site_name, info.getPlacementExtendedInfo().getSiteName());
////		dataMap.put(CreativeColumns.placement_id, info.getID());
////		dataMap.put(CreativeColumns.placement_name, info.getPlacementName());
////		dataMap.put(CreativeColumns.section_name, info.getPlacementExtendedInfo().getSiteSectionName());
////		dataMap.put(CreativeColumns.campaign_name, info.getPlacementExtendedInfo().getCampaignName());
////		dataMap.put(CreativeColumns.media_impressions, info.getDeliveredImpressions());	
////		
////		if (adInfo != null) {
////			dataMap.put(CreativeColumns.ad_id, adInfo.getID());
////			dataMap.put(CreativeColumns.ad_name, adInfo.getAdName());
////			dataMap.put(CreativeColumns.ad_format, adInfo.getAdDimensions());
////			dataMap.put(CreativeColumns.smart_version,(adInfo.getIsSmartAd()) ? 'Y' : 'N');
////			SmartVersioningType type = smartVersionHandler.getSmartVersion(adInfo.getID(), token);
////			dataMap.put(CreativeColumns.smart_version_group, type.getValue());
////		}
////		if (interaction != null) {
////			dataMap.put(CreativeColumns.interaction_name,interaction.getInteractionName());
////			dataMap.put(CreativeColumns.interaction_type, interaction.getClass().getName());
////		}
////		
////		return dataMap;
////	}
//}
