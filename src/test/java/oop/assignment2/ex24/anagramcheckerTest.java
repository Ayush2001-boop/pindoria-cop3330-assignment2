package oop.assignment2.ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class anagramcheckerTest
{

    @Test
    void isAnagram_returns_true_right_anagrams()
    {
        anagramchecker detector = new anagramchecker();
        boolean expected = true;
        boolean actual = detector.isAnagram("note","note");

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_false_not_anagrams()
    {
        anagramchecker detector = new anagramchecker();
        boolean expected = false;
        boolean actual = detector.isAnagram("note","tune");

        assertEquals(expected, actual);
    }
}