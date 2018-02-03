package com.brilliantbird.hifi_android.exception;

/**
 * Created by ELCOT on 03-02-2018.
 */
public class CustomException extends RuntimeException {

    private String errorMessage;

    public  CustomException(){
        super();
    }

    public CustomException(String errorMessage){
        super(errorMessage);
        this.errorMessage = errorMessage;
    }
}
