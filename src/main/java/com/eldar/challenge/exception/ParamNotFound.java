package com.eldar.challenge.exception;

public class ParamNotFound extends RuntimeException  {
    public ParamNotFound(String error){
        super(error);
    }
}
