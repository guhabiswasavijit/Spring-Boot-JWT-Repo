package com.demo.bankapp.ex;

public class TransactionLimitException extends RuntimeException {

	private static final long serialVersionUID = -3442309139923977110L;

	public TransactionLimitException(String message) {
		super("Transaction Limit: " + message);
	}

}
