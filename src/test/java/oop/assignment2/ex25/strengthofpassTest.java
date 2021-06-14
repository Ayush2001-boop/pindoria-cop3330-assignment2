package oop.assignment2.ex25;

import oop.assignment2.ex24.anagramchecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class strengthofpassTest {

    @Test
    void passwordValidator_is_correct() {
        strengthofpass x = new strengthofpass();
        String expected = "Very Strong";
        String actual = x.passwordValidator("1337h@xor!");

        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator_is_correct2() {
        strengthofpass x = new strengthofpass();
        String expected = "Strong";
        String actual = x.passwordValidator("abc123xyz");

        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator_is_correct3() {
        strengthofpass x = new strengthofpass();
        String expected = "Weak";
        String actual = x.passwordValidator("abcdef");

        assertEquals(expected, actual);
    }
    @Test
    void passwordValidator_is_correct4() {
        strengthofpass x = new strengthofpass();
        String expected = "Very Weak";
        String actual = x.passwordValidator("12345");

        assertEquals(expected, actual);
    }

}