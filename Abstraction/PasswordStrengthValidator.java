package com.gla.Abstraction;



interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8;
    }
}

public class PasswordStrengthValidator
{
    public static void main(String[] args) {
        String pass = "Java1234";
        if(SecurityUtils.isStrongPassword(pass))
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }
}

