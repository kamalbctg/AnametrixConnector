package com.anametrix.mediamind.connector;

import java.util.Date;
import java.util.Map;

import com.anametrix.connector.core.Connector;
import com.anametrix.connector.exception.ConnectorException;


public class MediaMindConnector implements Connector {

	private MediaMindClient mediaMindClient = new MediaMindClient();
	
	public MediaMindClient getMediaMindClient() {
		return mediaMindClient;
	}

	@Override
	public String verifyConnection(Map<String, String> configuration) {
		try {
			if(configuration.isEmpty()){
				throw new ConnectorException("Invalid Configuration");
			}
			mediaMindClient.login(configuration.get("userName"),configuration.get("password"), configuration.get("apiKey"));			
		} catch (ConnectorException e) {			
			return e.getMessage();
		}
		return null;
	}

	@Override
	public void getData(Date date, Map<String, String> configuration) {
		try {
			mediaMindClient.login(configuration.get("userName"),configuration.get("password"), configuration.get("apiKey"));
			mediaMindClient.getData(new Date(),configuration);
			
		} catch (ConnectorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		mediaMindClient.getSecurityToken();
	}
	
	

}
