package api.eyeblaster.handler;

import java.rmi.RemoteException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.eyeblaster.api.v1.datacontracts.placement.PlacementInfo;

public class PlacementHandlerTest {
	private String securityToken ;
	
	@Before
	public void init() throws RemoteException {
		AuthenticationHandler authHandler = new AuthenticationHandler();
		authHandler.Login("22SQ.API", "Password01","1a8a4001-9a02-4298-a70c-d72375b82976");
		securityToken = authHandler.getSecurityToken();
	}
	
	@Test
	public void getPlacementById() throws RemoteException{
		PlacementHandler handler = new PlacementHandler(securityToken);
		PlacementInfo info = handler.getPlacementById(2289132, true);
		Assert.assertEquals(2289132, info.getID());
	}
}
