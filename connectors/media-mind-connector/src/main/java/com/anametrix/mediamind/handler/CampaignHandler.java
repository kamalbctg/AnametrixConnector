package com.anametrix.mediamind.handler;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;



import com.anametrix.mediamind.commons.AxisOption;
import com.eyeblaster.api.message.campaign.GetCampaignsRequest;
import com.eyeblaster.api.message.campaign.GetCampaignsResponse;
import com.eyeblaster.api.message.campaign.ListPaging;
import com.eyeblaster.api.message.campaign.UserSecurityToken;
import com.eyeblaster.api.v1.datacontracts.ad.CampaignIDFilter;
import com.eyeblaster.api.v1.datacontracts.ad.CampaignNameFilter;
import com.eyeblaster.api.v1.datacontracts.campaign.ArrayOfCampaignInfo;
import com.eyeblaster.api.v1.datacontracts.campaign.ArrayOfCampaignServiceFilter;
import com.eyeblaster.api.v1.datacontracts.campaign.CampaignAdvertiserIDFilter;
import com.eyeblaster.api.v1.datacontracts.campaign.CampaignInfo;
import com.eyeblaster.api.v1.datacontracts.campaign.CampaignServiceFilter;
import api.eyeblaster.com.campaign.CampaignServiceStub;


public class CampaignHandler {
	private CampaignServiceStub stub;
	private String securityToken;
	
	public CampaignHandler(String token) throws RemoteException {
		this.securityToken = token;
		stub = new CampaignServiceStub();
		AxisOption.setOption(stub);
	}
	
	public CampaignInfo[] getCampaignsByAdvertiser(int advertiserId,boolean extendedinfo) throws RemoteException{
		CampaignAdvertiserIDFilter filter = new CampaignAdvertiserIDFilter();
		filter.setAdvertiserID(advertiserId);
		
		ArrayOfCampaignServiceFilter arrCampaignFilter = new ArrayOfCampaignServiceFilter();
		arrCampaignFilter.addCampaignServiceFilter(filter);
		
		GetCampaignsRequest req = new GetCampaignsRequest();
		req.setCampaignsFilter(arrCampaignFilter);
		// to get the total count
		req.setPaging(initPaging(0, 1));
		req.setShowCampaignExtendedInfo(extendedinfo);
		
		GetCampaignsResponse res = stub.GetCampaigns(req, createSecurityToken());
		
		//get all in one page
		req.setPaging(initPaging(0, res.getTotalCount()));
		res = stub.GetCampaigns(req, createSecurityToken());
		
		if(res.getCampaigns() != null){
			return res.getCampaigns().getCampaignInfo();
		}else{
			return new CampaignInfo[0];
		}
	}
	
	public CampaignInfo[] getCampaingByFilter(CampaignServiceFilter filter) throws RemoteException{
		
		
		ArrayOfCampaignServiceFilter arrCampaignFilter = new ArrayOfCampaignServiceFilter();
		arrCampaignFilter.addCampaignServiceFilter(filter);
		
		// request to get total count
		GetCampaignsRequest req =new GetCampaignsRequest();
		req.setPaging(initPaging(0, 1));
		req.setShowCampaignExtendedInfo(false);
		req.setCampaignsFilter(arrCampaignFilter);
		GetCampaignsResponse res = stub.GetCampaigns(req, createSecurityToken());
		
		//get all campaigns
		req.setPaging(initPaging(0, res.getTotalCount()));
		req.setShowCampaignExtendedInfo(true);		
		res = stub.GetCampaigns(req, createSecurityToken());
		
		return res.getCampaigns().getCampaignInfo();
		
	}
	
	public CampaignInfo getCampaignById(int camapignId) throws RemoteException{
		ListPaging pListPaging = initPaging(0, 1);
		
		CampaignIDFilter filter = new CampaignIDFilter();
		filter.setCampaignID(camapignId);
		
		ArrayOfCampaignServiceFilter arrCampaignFilter = new ArrayOfCampaignServiceFilter();
		
		GetCampaignsRequest req = new GetCampaignsRequest();
		req.setShowCampaignExtendedInfo(true);
		req.setCampaignsFilter(arrCampaignFilter);
		req.setPaging(pListPaging);
		
		GetCampaignsResponse res = stub.GetCampaigns(req, createSecurityToken());
		
		if(res != null && res.getCampaigns() != null && res.getCampaigns().getCampaignInfo() != null){
			return res.getCampaigns().getCampaignInfo()[0];
		}else{
			return null;
		}
	}
	
	public CampaignInfo getCampaignByName(String name) throws RemoteException{
		
		ListPaging pListPaging = initPaging(0, 1);
		
		CampaignNameFilter filter = new CampaignNameFilter();
		filter.setName(name);
		
		ArrayOfCampaignServiceFilter arrCampaignFilter = new ArrayOfCampaignServiceFilter();
		
		GetCampaignsRequest req = new GetCampaignsRequest();
		req.setShowCampaignExtendedInfo(false);
		req.setCampaignsFilter(arrCampaignFilter);
		req.setPaging(pListPaging);
		
		GetCampaignsResponse res = stub.GetCampaigns(req, createSecurityToken());
		
		if(res != null && res.getCampaigns() != null && res.getCampaigns().getCampaignInfo() != null){
			return res.getCampaigns().getCampaignInfo()[0];
		}else{
			return null;
		}
	}

	
	
	private UserSecurityToken createSecurityToken(){
		UserSecurityToken securityToken = new UserSecurityToken();
		securityToken.setUserSecurityToken(this.securityToken);		
		return securityToken;
	}	
	
	public static ListPaging initPaging(int pageIndex,int pageSize) {
		ListPaging pListPaging = new ListPaging();
		pListPaging.setPageIndex(pageIndex);
		pListPaging.setPageSize(pageSize);
		
		return pListPaging;
	}	

}
