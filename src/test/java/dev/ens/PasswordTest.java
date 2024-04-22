package dev.ens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordTest {

    @Test
    void returnTrueWhenPasswordLengthIsGreaterThan8() {
        //Given
        String password = "123456789";

        //Then

        boolean actual = Password.isPasswordLengthEightChars( password );

        //When
        boolean expected = true;
        assertTrue( actual, String.valueOf(expected));

    }

    @Test
    void returnFalseWhenPasswordLengthIsLowerThan8() {
        //Given
        String password = "1234567";

        //Then

        boolean actual = Password.isPasswordLengthEightChars( password );

        //When
        boolean expected = false;
        assertFalse( actual, String.valueOf(expected));

    }

    @Test
    void returnTrueWhenPasswordContainsDigits() {
        //Given
        String password = "test1digit";

        //Then

        boolean actual = Password.isPasswordContainsDigits( password );

        //When
        boolean expected = true;
        assertTrue( actual, String.valueOf(expected));

    }

    @Test
    void returnFalseWhenPasswordContainsNoDigits() {
        //Given
        String password = "testDigit";

        //Then

        boolean actual = Password.isPasswordContainsDigits( password );

        //When
        boolean expected = false;
        assertFalse( actual, String.valueOf(expected));

    }

    @Test
    void returnTrueWhenPasswordContainsSpecialChars() {
        //Given
        String password = "test@digit";

        //Then

        boolean actual = Password.isPasswordContainsSpecialChars( password );

        //When
        boolean expected = true;
        assertTrue( actual, String.valueOf(expected));

    }

    @Test
    void returnFalseWhenPasswordNotContainsSpecialChars() {
        //Given
        String password = "testDigit";

        //Then

        boolean actual = Password.isPasswordContainsSpecialChars( password );

        //When
        boolean expected = false;
        assertFalse( actual, String.valueOf(expected));

    }

    @Test
    void returnTrueWhenPasswordContainsUpperAndLowercase() {
        //Given
        String password = "testUpperLowercase";

        //Then

        boolean actual = Password.isPasswordContainsUpperAndLowercase( password );

        //When
        boolean expected = true;
        assertTrue( actual, String.valueOf(expected));

    }

    @Test
    void returnFalseWhenPasswordNotContainsUpperAndLowercase() {
        //Given
        String password = "testupperlowercase";

        //Then

        boolean actual = Password.isPasswordContainsUpperAndLowercase( password );

        //When
        boolean expected = false;
        assertFalse( actual, String.valueOf(expected));

    }

    @Test
    void returnTrueWhenPasswordIsCommon() {
        //Given
        String password = "Password123";

        //Then

        boolean actual = Password.isPasswordCommon( password );

        //When
        boolean expected = true;
        assertTrue( actual, String.valueOf(expected));

    }

    @Test
    void returnFalseWhenPasswordIsNotCommon() {
        //Given
        String password = "PasswordTest";

        //Then

        boolean actual = Password.isPasswordCommon( password );

        //When
        boolean expected = false;
        assertFalse( actual, String.valueOf(expected));
    }

}
