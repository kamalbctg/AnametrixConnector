package api.eyeblaster.handler;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;


import com.eyeblaster.api.message.placement.GetPlacementRequest;
import com.eyeblaster.api.message.placement.GetPlacementResponse;
import com.eyeblaster.api.message.placement.GetPlacementsRequest;
import com.eyeblaster.api.message.placement.GetPlacementsResponse;
import com.eyeblaster.api.message.placement.ListPaging;
import com.eyeblaster.api.message.placement.UserSecurityToken;
import com.eyeblaster.api.v1.datacontracts.placement.ArrayOfPlacementInfo;
import com.eyeblaster.api.v1.datacontracts.placement.ArrayOfPlacementServiceFilter;
import com.eyeblaster.api.v1.datacontracts.placement.PlacementInfo;
import com.eyeblaster.api.v1.datacontracts.placement.PlacementNameFilter;




import api.eyeblaster.com.placement.PlacementServiceStub;
import api.eyeblaster.commons.AxisOption;

public class PlacementHandler {
	private String securityToken;
	private PlacementServiceStub stub;
	
	public PlacementHandler(String token) throws RemoteException {
		this.securityToken = token;
		stub = new PlacementServiceStub();
		AxisOption.setOption(stub);
	}
	
	
	
	public PlacementInfo getPlacementById(int placementId,boolean extendedInfoRequired) throws RemoteException{
		GetPlacementRequest req = new GetPlacementRequest();
		req.setPlacementID(placementId);
		req.setShowPlacementExtendedInfo(extendedInfoRequired);
		GetPlacementResponse res = stub.GetPlacement(req, createSecurityToken());
		
		return res.getPlacement();
	}
	
	public PlacementInfo getPlacementByName(String name) throws RemoteException{
		
		
		ListPaging pListPaging = initPaging(0, 1);
		
		
		PlacementNameFilter filter = new PlacementNameFilter();
		filter.setPlacementName(name);
		
		ArrayOfPlacementServiceFilter arrPlacement = new ArrayOfPlacementServiceFilter();
		arrPlacement.addPlacementServiceFilter(filter);
		
		GetPlacementsRequest req = new GetPlacementsRequest();
		req.setPaging(pListPaging);
		req.setShowPlacementExtendedInfo(false);
		req.setPlacementsFilter(arrPlacement);
		
		GetPlacementsResponse res = stub.GetPlacements(req, createSecurityToken());
		
		if(res.getPlacements() != null && res.getPlacements().getPlacementInfo() != null){
			return res.getPlacements().getPlacementInfo()[0];
		}
		else{
			return null;
		}
	}

	public PlacementInfo[] loadPlacements(int pageIndex, int pageSize) throws RemoteException {
		 Map<String,Object> dataMap = new HashMap<String, Object>();
		
		PlacementServiceStub placementServiceStub = new PlacementServiceStub();
		AxisOption.setOption(placementServiceStub);
		

		GetPlacementsRequest req = new GetPlacementsRequest();
		req.setPaging(initPaging(pageIndex, pageSize));
		req.setShowPlacementExtendedInfo(true);
		
		
		GetPlacementsResponse res = placementServiceStub.GetPlacements(req,createSecurityToken());
		
		ArrayOfPlacementInfo arrInfo = res.getPlacements();
		return arrInfo.getPlacementInfo();
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
