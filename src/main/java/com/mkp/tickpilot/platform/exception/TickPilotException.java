package com.mkp.tickpilot.platform.exception;

import com.mkp.tickpilot.platform.util.Constants.ERROR_CODES;

public class TickPilotException extends Exception {

    private static final long serialVersionUID = 78457393034344552L;

    private ERROR_CODES errorCode;

    public TickPilotException() {
    }

    public TickPilotException(ERROR_CODES errorCode) {
        this.errorCode = errorCode;
    }
    
    public ERROR_CODES getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ERROR_CODES errorCode) {
        this.errorCode = errorCode;
    }

}
