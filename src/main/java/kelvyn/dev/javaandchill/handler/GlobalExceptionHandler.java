package kelvyn.dev.javaandchill.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import kelvyn.dev.javaandchill.exception.ErrorResponse;
import kelvyn.dev.javaandchill.exception.NotFoundException;
import lombok.Builder;;

@RestControllerAdvice 
@Builder 
public class GlobalExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFoundException(NotFoundException ex){
        ErrorResponse response = ErrorResponse.builder()
            .message(ex.getMessage()).status(HttpStatus.NOT_FOUND.value()).build();

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}
