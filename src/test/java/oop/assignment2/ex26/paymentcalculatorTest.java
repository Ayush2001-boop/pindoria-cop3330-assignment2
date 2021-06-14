package oop.assignment2.ex26;

import oop.assignment2.ex24.anagramchecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class paymentcalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff_isright()
    {
        paymentcalculator detector = new paymentcalculator();
        double expected = 11;
        double actual = detector.calculateMonthsUntilPaidOff(1000,0.00027,100);
        double x = Math.ceil(actual);
        assertEquals(expected, x);
    }
}