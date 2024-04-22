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

    public static boolean isPasswordContainsSpecialChars( String password ) {
        // use regex to check if password contains special chars
        return password.matches(".*[!@#$%&*()_+=|<>?{}\\\\[\\\\]~-].*");
    }

    public static boolean isPasswordCommon( String password ) {

        for(String commonPassword : CommonPasswords.commonPasswords) {
            if(password.equals(commonPassword)) {
                return true;
            }
        }
        return false;
    }


    public static boolean isPasswordValid(String password) {
        return isPasswordLengthEightChars(password) && isPasswordContainsDigits(password)
                && isPasswordContainsUpperAndLowercase(password) && isPasswordContainsSpecialChars(password)
                && !isPasswordCommon(password);
    }
}



