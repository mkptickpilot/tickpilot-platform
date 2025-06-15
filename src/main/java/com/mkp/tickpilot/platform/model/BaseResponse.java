package com.mkp.tickpilot.platform.model;

import com.mkp.tickpilot.platform.util.Constants.ERROR_CODES;

public class BaseResponse {

	private boolean error;

	private String message;

	private String code;

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static BaseResponse getInstance(ERROR_CODES errorCode) {
		BaseResponse response = new BaseResponse();
		response.setError(true);
		response.setCode(errorCode.name());
		response.setMessage(errorCode.getMessage());
		return response;
	}
	
	public static BaseResponse getInstance() {
		BaseResponse response = new BaseResponse();
		response.setError(false);
		return response;
	}
	
	public static BaseResponse getInstance(String message) {
		BaseResponse response = new BaseResponse();
		response.setMessage(message);
		response.setError(false);
		return response;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
