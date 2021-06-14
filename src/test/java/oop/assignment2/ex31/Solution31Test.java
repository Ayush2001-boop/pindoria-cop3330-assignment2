package oop.assignment2.ex31;

import oop.assignment2.ex29.Solution29;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void isNumeric_yes() {
        Solution31 x = new Solution31();
        boolean expected = true;
        boolean actual = x.isNumeric("12389476");

        assertEquals(expected, actual);
    }

    @Test
    void isNumeric_no() {
        Solution31 x = new Solution31();
        boolean expected = false;
        boolean actual = x.isNumeric("12389sdfjghk");

        assertEquals(expected, actual);
    }
}