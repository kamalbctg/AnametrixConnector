package com.anametrix.mediamind.connector;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;

import com.anametrix.connector.core.Connector;


public class Test {
	private Map<String, String> configuration;
	
	@Before
	public void init() {
		configuration = new HashMap<String, String>();
		configuration.put(ConfigurationParam.USERNAME, "22SQ.API");
		configuration.put(ConfigurationParam.PASSWORD, "Password01");
		configuration.put(ConfigurationParam.APIKEY, "1a8a4001-9a02-4298-a70c-d72375b82976");
	}
	
	
	public void testVerifyConnectionUnknownHostError() {
		Connector connector = new MediaMindConnector();
		String msg = connector.verifyConnection(configuration);
		//Assert.assertEquals("Unable to conect", msg);
	}
	
	@org.junit.Test
	public void testVerifyConnection() {
		
		Connector connector = new MediaMindConnector();			
		configuration.put(ConfigurationParam.STARTDATE, "03/14/2011");
		configuration.put(ConfigurationParam.ENDDATE, "12/31/2012");
		configuration.put(ConfigurationParam.CAMPAIGNID, "99291");
		configuration.put(ConfigurationParam.cookieWindowClicks, "9");
		configuration.put(ConfigurationParam.cookieWindowImpressions, "10");
		configuration.put(ConfigurationParam.conversionAttributionModel, "3");
		
	    connector.getData(new Date(),configuration);
		
	//	Assert.assertEquals(null, msg);
	//	System.out.print(((MediaMindConnector)connector).getMediaMindClient().getSecurityToken());
	//	Assert.assertNotNull(((MediaMindConnector)connector).getMediaMindClient().getSecurityToken());
		
	}	
	
	
}
