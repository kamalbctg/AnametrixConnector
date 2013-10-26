package com.anametrix.mediamind.handler;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.anametrix.mediamind.commons.AxisOption;
import com.eyeblaster.api.message.advertiser.GetAdvertisersRequest;
import com.eyeblaster.api.message.advertiser.GetAdvertisersResponse;
import com.eyeblaster.api.message.advertiser.ListPaging;
import com.eyeblaster.api.message.advertiser.UserSecurityToken;
import com.eyeblaster.api.v1.datacontracts.advertiser.AdvertiserInfo;
import com.eyeblaster.api.v1.datacontracts.advertiser.AdvertiserNameFilter;
import com.eyeblaster.api.v1.datacontracts.advertiser.ArrayOfAdvertiserInfo;
import com.eyeblaster.api.v1.datacontracts.advertiser.ArrayOfAdvertiserServiceFilter;

import api.eyeblaster.com.advertiser.AdvertiserServiceStub;



public class AdvertiserHandler {
	private AdvertiserServiceStub stub;
	private String token;
	public AdvertiserHandler(String token) throws AxisFault {
		stub = new AdvertiserServiceStub();
		AxisOption.setOption(stub);
		this.token = token;
	}
	
	
	public AdvertiserInfo[] getAdvertisers(boolean extendedInfo) throws RemoteException {
		GetAdvertisersRequest req = new GetAdvertisersRequest();
		req.setPaging(initPaging(0, 1));
		req.setShowAdvertiserExtendedInfo(extendedInfo);
		
		GetAdvertisersResponse res = stub.GetAdvertisers(req, createSecurityToken());
		
		req.setPaging(initPaging(0, res.getTotalCount()));
		res = stub.GetAdvertisers(req, createSecurityToken());
		
		if(res.getAdvertisers() != null){
			return res.getAdvertisers().getAdvertiserInfo();
		}else{
			return new AdvertiserInfo[0] ;
		}
		
	}
	
	public AdvertiserInfo getAdvertiserByName(String name,Boolean extendedInfoRequired) throws RemoteException {
		
		AdvertiserInfo info = null;
			
		ArrayOfAdvertiserServiceFilter arrAdvertiserFilter = new ArrayOfAdvertiserServiceFilter();
		AdvertiserNameFilter advertiserNameFilter = new AdvertiserNameFilter();
		advertiserNameFilter.setAdvertiserName(name);
		arrAdvertiserFilter.addAdvertiserServiceFilter(advertiserNameFilter);
		
		
		ListPaging pListPaging = initPaging(0, 1);
		
		GetAdvertisersRequest req = new GetAdvertisersRequest();
		req.setAdvertisersFilter(arrAdvertiserFilter);
		req.setPaging(pListPaging);
		req.setShowAdvertiserExtendedInfo(extendedInfoRequired);		
		
		GetAdvertisersResponse res = stub.GetAdvertisers(req, createSecurityToken());
		ArrayOfAdvertiserInfo arrInfo =  res.getAdvertisers();
		
		if(arrInfo != null && arrInfo.getAdvertiserInfo() != null){			
			info = arrInfo.getAdvertiserInfo()[0];
		}
		
		return info;
	}
	
//	public CampaignInfo[] getAdvertiserCampaigns(String name,UserSecurityToken token) throws RemoteException{		
//		//get advertiser campaigns 
//		AdvertiserInfo info = getAdvertiserByName(name, token);
//		
//		CampaignAdvertiserIDFilter filter = new CampaignAdvertiserIDFilter();
//		filter.setAdvertiserID(info.getID());
//		
//		return  campaignHandler.getCampaingByFilter(filter, token);
//		
//	}	
	
	private UserSecurityToken createSecurityToken(){
		UserSecurityToken securityToken = new UserSecurityToken();
		securityToken.setUserSecurityToken(this.token);		
		return securityToken;
	}
	
	public static ListPaging initPaging(int pageIndex,int pageSize) {
		ListPaging pListPaging = new ListPaging();
		pListPaging.setPageIndex(pageIndex);
		pListPaging.setPageSize(pageSize);
		
		return pListPaging;
	}	
}
