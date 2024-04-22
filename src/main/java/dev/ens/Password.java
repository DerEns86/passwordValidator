package dev.ens;

public class Password {

    public static boolean isPasswordLengthEightChars( String password ) {
        return password.length() > 8;
    }

    public static boolean isPasswordContainsDigits( String password ) {
        // use regex to check if password contains digits
        return password.matches(".*\\d.*");
    }
}
