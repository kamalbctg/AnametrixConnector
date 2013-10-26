package com.anametrix.mediamind.handler;

import java.rmi.RemoteException;

import com.anametrix.mediamind.commons.AxisOption;
import com.eyeblaster.api.message.ad.GetAdRequest;
import com.eyeblaster.api.message.ad.GetAdResponse;
import com.eyeblaster.api.message.ad.UserSecurityToken;
import com.eyeblaster.api.v1.datacontracts.ad.AdInfo;

import api.eyeblaster.com.ad.AdServiceStub;



public class AdHandler {
	private AdServiceStub stub;
	private String token;
	public AdHandler(String token) throws RemoteException {
		stub = new AdServiceStub();
		AxisOption.setOption(stub);
		this.token = token;
	}
	
	public AdInfo getAdById(int adId ) throws RemoteException{
		GetAdRequest req = new GetAdRequest();
		req.setAdID(adId);
		req.setShowAdExtendedInfo(true);
		
		GetAdResponse res = stub.GetAd(req, createSecurityToken());
		return res.getAd();		
	}
	
	
	private UserSecurityToken createSecurityToken(){
		UserSecurityToken securityToken = new UserSecurityToken();
		securityToken.setUserSecurityToken(this.token);		
		return securityToken;
	}
}
