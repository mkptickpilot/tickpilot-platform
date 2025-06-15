package com.mkp.tickpilot.platform.util;

public class Constants {

    public enum ERROR_CODES {

        INVALID_AUTH_TOKEN("Invalid auth token"),
        INVALID_EMAIL("Invalid Email"), 
		INVALID_PASSWORD("Invalid Password");

        private final String message;

		ERROR_CODES(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}
    }

}
