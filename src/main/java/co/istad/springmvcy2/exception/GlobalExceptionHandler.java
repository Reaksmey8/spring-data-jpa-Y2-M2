package co.istad.springmvcy2.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<?> handleResponseStatusException(ResponseStatusException e){
        log.error("Response status exception occurred");
        log.error("Status: {}", e.getStatusCode());
        log.error("Reason: {}", e.getReason());

        Map<String, Object> body = new HashMap<>();
        body.put("message: ", e.getReason());
        body.put("Status: ", e.getStatusCode());
        body.put("timestamp", System.currentTimeMillis());
        return ResponseEntity.status(e.getStatusCode()).body(body);
    }

}
