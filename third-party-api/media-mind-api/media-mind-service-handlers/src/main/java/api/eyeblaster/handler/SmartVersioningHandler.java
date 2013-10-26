package api.eyeblaster.handler;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;


import com.eyeblaster.api.message.smart.GetSmartVersioningTypeRequest;
import com.eyeblaster.api.message.smart.GetSmartVersioningTypeResponse;
import com.eyeblaster.api.message.smart.UserSecurityToken;
import com.eyeblaster.api.v1.datacontracts.smart.SmartVersioningType;

import api.eyeblaster.com.smart.SmartVersioningServiceStub;
import api.eyeblaster.commons.AxisOption;



public class SmartVersioningHandler {
	
	private SmartVersioningServiceStub stub;
	private String securityToken ;
	
	
	public SmartVersioningHandler(String token) throws RemoteException {
		stub = new SmartVersioningServiceStub();
		AxisOption.setOption(stub);
		this.securityToken = token;
		
	}
	
	public SmartVersioningType getSmartVersion(int adId) throws RemoteException {
		
			SmartVersioningServiceStub stub = new SmartVersioningServiceStub();
			AxisOption.setOption(stub);
			
			GetSmartVersioningTypeRequest req =new GetSmartVersioningTypeRequest();
			req.setAdID(adId);
			
			GetSmartVersioningTypeResponse res = stub.GetSmartVersioningType(req, createSecurityToken());
			return res.getSmartVersioningType();
			
	}
	
	private UserSecurityToken createSecurityToken(){
		UserSecurityToken securityToken = new UserSecurityToken();
		securityToken.setUserSecurityToken(this.securityToken);		
		return securityToken;
	}		
}
