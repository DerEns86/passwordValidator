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

}
