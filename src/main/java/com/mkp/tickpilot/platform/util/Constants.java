package com.mkp.tickpilot.platform.util;

public class Constants {

    public enum ERROR_CODES {

        INVALID_AUTH_TOKEN("Invalid auth token."),
        INVALID_EMAIL("Invalid Email."), 
		INVALID_PASSWORD("Invalid Password."),
    	EMAIL_ALREADY_EXIST("Email already exist.");

        private final String message;

		ERROR_CODES(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}
    }

}
