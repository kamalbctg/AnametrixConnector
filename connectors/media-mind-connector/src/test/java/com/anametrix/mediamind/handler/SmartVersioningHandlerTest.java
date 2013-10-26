package com.anametrix.mediamind.handler;

import java.rmi.RemoteException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.eyeblaster.api.v1.datacontracts.smart.SmartVersioningType;

public class SmartVersioningHandlerTest {
	private String securityToken ;
	
	@Before
	public void init() throws RemoteException {
		AuthenticationHandler authHandler = new AuthenticationHandler();
		authHandler.Login("22SQ.API", "Password01","1a8a4001-9a02-4298-a70c-d72375b82976");
		securityToken = authHandler.getSecurityToken();
	}
	
	
	@Test
	public void getSmartVersion() throws RemoteException{
		SmartVersioningHandler handler = new SmartVersioningHandler(securityToken);
		SmartVersioningType type = handler.getSmartVersion(4585241);
		System.out.println(type.getValue());
	}
}
