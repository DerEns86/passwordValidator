package dev.ens;

public class Password {

    public static boolean isPasswordLengthEightChars( String password ) {
        return password.length() > 8;
    }

    public static boolean isPasswordContainsDigits( String password ) {
        // use regex to check if password contains digits
        return password.matches(".*\\d.*");
    }

    public static boolean isPasswordContainsUpperAndLowercase( String password ) {
        // use regex to check if password contains upper and lowercase
        return password.matches(".*[A-Z].*");
    }
}



/*

* public boolean isPasswordCommon ( String password )
* */