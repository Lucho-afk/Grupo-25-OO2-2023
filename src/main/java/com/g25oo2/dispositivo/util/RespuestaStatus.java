package com.g25oo2.dispositivo.util;

public class RespuestaStatus {
	private String message;
	private int status;

	
	
	public RespuestaStatus() {
	}

	public RespuestaStatus(String message, int status) {
		this.message = message;
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
