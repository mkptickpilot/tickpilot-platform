package com.mkp.tickpilot.platform.util;

public class Constants {

    public enum ERROR_CODES {

        INVALID_AUTH_TOKEN("Invalid auth token."),
        INVALID_EMAIL("Invalid Email."), 
		INVALID_PASSWORD("Invalid Password."),
    	EMAIL_ALREADY_EXIST("Email already exist."),
		EMPLOYEE_NOT_FOUND("Employee not found."),
		ORGANIZATION_NOT_FOUND("Organization not found."),
		PROJECT_NOT_FOUND("Project not found."),
		PROJECT_NAME_ALREADY_EXISTS("Project name already exists."),
		ORGANIZATION_NAME_ALREADY_EXISTS("Organization name already exists."),
		ACCESS_RESTRICTED("Access is restricted.");

        private final String message;

		ERROR_CODES(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}
    }

	public enum ProjectStatus {
		ACTIVE,
        INACTIVE,
        COMPLETED,
        PLANNED,
        ON_HOLD,
        CANCELLED;
	}

	public enum SprintStatus {
		ACTIVE,
        INACTIVE,
        COMPLETED,
        PLANNED,
        ON_HOLD,
        CANCELLED;
	}

	public enum TicketStatus {
		TODO,
		IN_PROGRESS,
		PEER_REVIEW,
		QA,
		IN_REVIEW,
		DONE;
	}

}
