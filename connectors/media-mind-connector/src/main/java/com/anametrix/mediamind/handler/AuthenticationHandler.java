package com.anametrix.mediamind.handler;

import java.net.UnknownHostException;
import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.anametrix.mediamind.commons.AxisOption;



import api.eyeblaster.com.auth.AuthenticationServiceStub;
import api.eyeblaster.com.auth.ClientLogin;
import api.eyeblaster.com.auth.ClientLoginResponse;


public class AuthenticationHandler {
	private AuthenticationServiceStub stub ;
	private String securityToken;

	public String getSecurityToken() {
		return securityToken;
	}
	
	public AuthenticationHandler() throws AxisFault {
		stub = new AuthenticationServiceStub();
		AxisOption.setOption(stub);
	}
	
	public void Login(String userName, String password, String apiKey) throws RemoteException{
			ClientLogin clientLogin = new ClientLogin();
			clientLogin.setUsername(userName);
			clientLogin.setPassword(password);
			clientLogin.setApplicationKey(apiKey);
			ClientLoginResponse clientLoginResponse = stub.ClientLogin(clientLogin);
			securityToken = clientLoginResponse.getClientLoginResult();
	}
	
}
