package com.anametrix.connector.core;

public interface Connector {
	/**
	 * Verifies that a connection can be made and that data is accessible 
	 * using the supplied configuration parameters.
	 * @param configuration
	 * @return Null, if the connection could be made successfully. 
	 * If a failure occurred, returns a string appropriate for an end-user 
	 * to see, describing the reason why the connection failed.
	 */
	public abstract String verifyConnection(java.util.Map<String, String> configuration);
	
	/**
	 * Connects to the API using the parameters in the configuration 
	 * object and downloads data or the specified parameters. The downloaded 
	 * data should be generated in a format specified in the connector 
	 * requirements document.
	 * @param date The date for which to download data
	 * @param configuration Name-value pair hash of configuration 
	 * parameters required to download data
	 */
	public abstract void getData(java.util.Date date, java.util.Map<String, String> configuration);
	

}
