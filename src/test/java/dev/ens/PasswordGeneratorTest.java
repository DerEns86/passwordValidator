package dev.ens;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordGeneratorTest {
    @Test
    void createStringWithLengthOfTen() {
        //Given
        int length = 10;

        //Then

        String actual = PasswordGenerator.generatePassword( length );

        //When
        String expected = "10";
        assertEquals( expected, actual );

    }
}
