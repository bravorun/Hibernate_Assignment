package com.traineeapp.model.exceptions;

public class DataAccessExcetion extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DataAccessExcetion(Throwable cause) {
		super(cause);
	}
}
