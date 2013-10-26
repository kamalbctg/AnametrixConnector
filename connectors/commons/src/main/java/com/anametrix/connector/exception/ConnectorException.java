package com.anametrix.connector.exception;

import javax.xml.namespace.QName;

public class ConnectorException extends Exception {
	public ConnectorException(String msg) {
		super(msg);

	}

	public ConnectorException(QName faultCode) {

	}

}
