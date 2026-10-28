package kelvyn.dev.javaandchill.exception;

public class NotFoundException extends RuntimeException{
    
    public NotFoundException(String message){
        super(message);
    }
}
