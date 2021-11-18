package com.pb.YKostenko.hw8;

public class WrongLoginException extends Exception{


    public WrongLoginException(){

    }
    public WrongLoginException(String message){
        Exception exc = new Exception(message);
    }
}
