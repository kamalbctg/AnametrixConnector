package com.anametrix.mediamind.handler;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.anametrix.mediamind.model.AdPerformanceReport;
import com.anametrix.mediamind.model.PlacementPerformanceReport;



public class AnalyticsDataServiceHandlerTest {
	private String securityToken ;
	
	@Before
	public void init() throws RemoteException {
		AuthenticationHandler authHandler = new AuthenticationHandler();
		authHandler.Login("22SQ.API", "Password01","1a8a4001-9a02-4298-a70c-d72375b82976");
		securityToken = authHandler.getSecurityToken();
	}
	


	public void testAnalyticsAdReport() throws RemoteException, ParseException  {
		AnalyticsDataServiceHandler handler = new AnalyticsDataServiceHandler(securityToken);
		
		SimpleDateFormat fdt = new SimpleDateFormat("MM/dd/yyyy");
		
		Date reportStartDate = fdt.parse("03/14/2011");
		Date reportEndDate = fdt.parse("12/31/2012");
		
		AdPerformanceReport r = (AdPerformanceReport) handler.getReport(reportStartDate, reportEndDate,99291,9,10,3,8,AdPerformanceReport.class);		
		System.out.println(r.getDataRowList());
	}
	
	@Test
	public void testAnalyticsPacementReport() throws RemoteException, ParseException  {
		AnalyticsDataServiceHandler handler = new AnalyticsDataServiceHandler(securityToken);
		
		SimpleDateFormat fdt = new SimpleDateFormat("MM/dd/yyyy");
		
		Date reportStartDate = fdt.parse("03/14/2011");
		Date reportEndDate = fdt.parse("12/31/2012");
		AdPerformanceReport r1 = (AdPerformanceReport) handler.getReport(reportStartDate, reportEndDate,99291,9,10,3,8,AdPerformanceReport.class);	
		//dataLevelID = 16 represend palacement level
		PlacementPerformanceReport r = (PlacementPerformanceReport) handler.getReport(reportStartDate, reportEndDate,99291,9,10,3,16,PlacementPerformanceReport.class);		
		System.out.println(r.getDataRowList());
	}	
}
