package com.ap.ap.excepcion;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String mensaje){
        super(mensaje);
    }
}
