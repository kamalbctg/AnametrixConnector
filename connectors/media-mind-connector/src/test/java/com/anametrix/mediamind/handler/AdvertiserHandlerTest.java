package com.anametrix.mediamind.handler;

import java.rmi.RemoteException;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.eyeblaster.api.v1.datacontracts.advertiser.AdvertiserInfo;

public class AdvertiserHandlerTest {
	private String securityToken ;
	
	@Before
	public void init() throws RemoteException {
		AuthenticationHandler authHandler = new AuthenticationHandler();
		authHandler.Login("22SQ.API", "Password01","1a8a4001-9a02-4298-a70c-d72375b82976");
		securityToken = authHandler.getSecurityToken();
	}

	@Test
	public void getAdvertiserByName() throws RemoteException{
		AdvertiserHandler handler = new AdvertiserHandler(securityToken);
		AdvertiserInfo info = handler.getAdvertiserByName("Baskin Robbins",false);
		Assert.assertEquals("Baskin Robbins", info.getAdvertiserName());
	}
	
}
