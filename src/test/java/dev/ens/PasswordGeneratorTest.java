package dev.ens;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class PasswordGeneratorTest {

    @Test
    void testGeneratedPasswordIsNotNull() {
        String password = PasswordGenerator.generatePassword(10);
        assertNotNull(password);
    }

    @Test
    void testGeneratedPasswordHasCorrectLength() {
        int length = 10;
        String password = PasswordGenerator.generatePassword(length);
        assertEquals(length, password.length());
    }

    @Test
    void testGeneratedPasswordIsValid() {
        String password = PasswordGenerator.generatePassword(10);
        assertTrue(Password.isPasswordValid(password));
    }

}
