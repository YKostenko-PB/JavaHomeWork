package com.pb.YKostenko.hw8;

public class WrongPasswordException extends Exception{


    public WrongPasswordException(){

    }
    public WrongPasswordException(String message){
        Exception exc = new Exception(message);
    }
}
