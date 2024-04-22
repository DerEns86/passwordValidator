package dev.ens;



import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PasswordGenerator {

    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String DIGIT = "0123456789";
    private static final String SPECIAL_CHAR = "!@#$%&*()_+=|<>?{}\\[\\]~-";
    private static final String PASSWORD_ALLOW_BASE = CHAR_LOWER + CHAR_UPPER + DIGIT + SPECIAL_CHAR;
    private static final String PASSWORD_ALLOW_BASE_SHUFFLE = shuffleString(PASSWORD_ALLOW_BASE);
    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    public static String generatePassword(int length) {
        if (length < 8) throw new IllegalArgumentException("Password length must be at least 8 characters.");

        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            password.append(PASSWORD_ALLOW_BASE_SHUFFLE.charAt(SECURE_RANDOM.nextInt(PASSWORD_ALLOW_BASE_SHUFFLE.length())));
        }

        String finalPassword = password.toString();

        if (Password.isPasswordValid(finalPassword)) {
            return finalPassword;
        } else {
            return generatePassword(length);
        }
    }

    private static String shuffleString(String string) {
        List<String> letters = Arrays.asList(string.split(""));
        Collections.shuffle(letters);
        return letters.stream().collect(Collectors.joining());
    }
}
