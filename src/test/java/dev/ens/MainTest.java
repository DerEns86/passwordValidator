package dev.ens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class MainTest {

    @Test
    void whenPasswordIsNullReturnFalse() {
        //Given
        String password = null;

        //Then

        boolean actual = Main.passwordValidator( password );

        //When
        boolean expected = false;
        assertFalse( actual, String.valueOf(expected));

    }
}
