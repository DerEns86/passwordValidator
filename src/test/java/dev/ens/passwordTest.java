package dev.ens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class passwordTest {

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

}
