package com.briup.exception;

public class StudentException extends RuntimeException {
	/**
	 * �Զ����쳣
	 */
	private static final long serialVersionUID = 1L;

	public StudentException() {
	}

	public StudentException(String msg) {
		super(msg);
	}
}
