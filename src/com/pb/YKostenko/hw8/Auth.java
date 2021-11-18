package com.pb.YKostenko.hw8;

public class Auth {
    private String login;
    private  String password;

    public void signUp (String login, String password, String confirmPassword){
        if (password.equals(confirmPassword)) {
            this.login = login;
            this.password = password;
        }
        else {
            System.out.println("Пароль не подтвержден");
        }
    }

    public void signIn(String login, String password){
        if (login.equals(this.login) && password.equals(this.password)){
            System.out.println("Вход выполнен успешно.");
        }
        else {
            System.out.println("Логин или пароль введены неверно.");
        }
    }
}
