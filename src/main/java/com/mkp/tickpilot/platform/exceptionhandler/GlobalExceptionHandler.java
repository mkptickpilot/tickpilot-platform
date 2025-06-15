package com.mkp.tickpilot.platform.exceptionhandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.mkp.tickpilot.platform.exception.TickPilotException;
import com.mkp.tickpilot.platform.model.BaseResponse;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler()
    protected ResponseEntity<Object> handleTickPilotException(final TickPilotException ex, final WebRequest request) {
        log.error("Error occurred", ex);
        log.error("API Path: {}", request.getDescription(false));
        return ResponseEntity.badRequest().body(BaseResponse.getInstance(ex.getErrorCode()));
    }
}
