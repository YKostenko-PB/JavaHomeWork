package com.pb.YKostenko.hw8;

public class Auth {
    private String login;
    private  String password;

    public void signUp (String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.matches("[\\w]+") && login.length() < 21 && login.length() > 4) {
            this.login = login;
        } else {
            throw new WrongLoginException("Login должен содержать только латинские буквы и цифры");
        }
        if (password.equals(confirmPassword) && (password.matches("[\\w]+") || password.contains("_") )
                && password.length() < 21 && password.length() > 4) {
            this.password = password;
        } else {
            throw new WrongPasswordException("Password должен содержать только латинские буквы и цифры и нижнее подчеркивание");
        }
    }

    public void signIn(String login, String password) throws WrongLoginException{
        if (login.equals(this.login) && password.equals(this.password)){
            System.out.println("Вход выполнен успешно.");
        }
        else {
            throw new WrongLoginException("Неверно введен логин или пароль.");
        }
    }
}
