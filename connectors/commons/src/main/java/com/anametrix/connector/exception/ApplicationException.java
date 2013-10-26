package com.anametrix.connector.exception;

import java.beans.ExceptionListener;

public class ApplicationException extends Exception {
	public ApplicationException(String msg) {
		super(msg);
	}
}
