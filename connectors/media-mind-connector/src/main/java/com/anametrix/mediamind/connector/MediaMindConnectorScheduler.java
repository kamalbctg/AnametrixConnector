package com.anametrix.mediamind.connector;



import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.anametrix.connector.core.Connector;

@Component("mediaMindConnectorScheduler")
public class MediaMindConnectorScheduler {
	static final Logger log = Logger.getLogger(MediaMindConnectorScheduler.class);
	Connector connector = new MediaMindConnector();
	Map<String, String> configuration;;
	
	public MediaMindConnectorScheduler() {
		configuration = new HashMap<String, String>();
		configuration.put(ConfigurationParam.USERNAME, "22SQ.API");
		configuration.put(ConfigurationParam.PASSWORD, "Password01");
		configuration.put(ConfigurationParam.APIKEY, "1a8a4001-9a02-4298-a70c-d72375b82976");
		configuration.put(ConfigurationParam.cookieWindowClicks, "9");
		configuration.put(ConfigurationParam.cookieWindowImpressions, "10");
		configuration.put(ConfigurationParam.conversionAttributionModel, "3");		
	}
	
	public void loadAdvertiserCamaignAnalyticsReport() {
		System.out.println("Scheduler Started At :"+ new Date());
		log.info("Scheduler Started At :"+ new Date());
		//connector.getData(new Date(), configuration);
	}	
	
}
