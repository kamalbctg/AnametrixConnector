package com.anametrix.mediamind.commons;

import org.apache.axis2.client.Options;

public class AxisOption {
	public static synchronized void  setOption(org.apache.axis2.client.Stub stub) {
		Options options = stub._getServiceClient().getOptions();
		options.setTimeOutInMilliSeconds(10000);
		options.setProperty(org.apache.axis2.transport.http.HTTPConstants.HTTP_PROTOCOL_VERSION,
				org.apache.axis2.transport.http.HTTPConstants.HEADER_PROTOCOL_10);
	}
}
