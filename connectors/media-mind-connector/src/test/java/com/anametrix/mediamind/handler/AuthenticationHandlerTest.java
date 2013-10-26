package com.anametrix.mediamind.handler;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.junit.Assert;
import org.junit.Test;

public class AuthenticationHandlerTest {

	@Test
	public void testLogin() throws RemoteException {
		AuthenticationHandler authHandler = new AuthenticationHandler();
		authHandler.Login("22SQ.API", "Password01","1a8a4001-9a02-4298-a70c-d72375b82976");
		System.out.print(authHandler.getSecurityToken());
		Assert.assertNotNull(authHandler.getSecurityToken());
	}
}
