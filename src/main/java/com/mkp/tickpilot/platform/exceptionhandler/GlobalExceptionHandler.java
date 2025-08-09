package com.mkp.tickpilot.platform.exceptionhandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.mkp.tickpilot.platform.exception.TickPilotException;
import com.mkp.tickpilot.platform.model.BaseResponse;
import com.mkp.tickpilot.platform.util.Constants.ERROR_CODES;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler()
    protected ResponseEntity<Object> handleTickPilotException(final TickPilotException ex, final WebRequest request) {
        log.error("Error occurred", ex);
        log.error("API Path: {}", request.getDescription(false));
        if(ex.getErrorCode().equals(ERROR_CODES.ACCESS_RESTRICTED)) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(BaseResponse.getInstance(ex.getErrorCode()));
        }
        return ResponseEntity.badRequest().body(BaseResponse.getInstance(ex.getErrorCode()));
    }
}
