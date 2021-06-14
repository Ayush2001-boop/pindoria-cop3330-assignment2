package oop.assignment2.ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    void isNumeric_yes() {
        Solution29 x = new Solution29();
        boolean expected = true;
        boolean actual = x.isNumeric("12389476");

        assertEquals(expected, actual);
    }

    @Test
    void isNumeric_no() {
        Solution29 x = new Solution29();
        boolean expected = false;
        boolean actual = x.isNumeric("12389sdfjghk");

        assertEquals(expected, actual);
    }
}