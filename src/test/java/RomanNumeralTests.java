import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class RomanNumeralTests {
    @Test
    @DisplayName("should return Old Roman Numerals after receiving integer between 1 and 500")
    public void testOldConversion() {
        assertEquals("I", RomanNumerals.convert_to_old_roman(1));
        assertEquals("IIII", RomanNumerals.convert_to_old_roman(4));
        assertEquals("V", RomanNumerals.convert_to_old_roman(5));
        assertEquals("VIIII", RomanNumerals.convert_to_old_roman(9));
        assertEquals("X", RomanNumerals.convert_to_old_roman(10));
        assertEquals("XIIII", RomanNumerals.convert_to_old_roman(14));
        assertEquals("XXXX", RomanNumerals.convert_to_old_roman(40));
        assertEquals("L", RomanNumerals.convert_to_old_roman(50));
        assertEquals("LXXXX", RomanNumerals.convert_to_old_roman(90));
        assertEquals("C", RomanNumerals.convert_to_old_roman(100));
        assertEquals("CXXXI", RomanNumerals.convert_to_old_roman(131));
        assertEquals("CCCC", RomanNumerals.convert_to_old_roman(400));
        assertEquals("D", RomanNumerals.convert_to_old_roman(500));
        assertEquals("DCCCC", RomanNumerals.convert_to_old_roman(900));
        assertEquals("M", RomanNumerals.convert_to_old_roman(1000));
    }

    @Test
    @DisplayName("should return New Roman Numerals after receiving integer between 1 and 500")
    public void testNewConversion() {
        assertEquals("I", RomanNumerals.convert_to_new_roman(1));
        assertEquals("IV", RomanNumerals.convert_to_new_roman(4));
        assertEquals("V", RomanNumerals.convert_to_new_roman(5));
        assertEquals("IX", RomanNumerals.convert_to_new_roman(9));
        assertEquals("X", RomanNumerals.convert_to_new_roman(10));
        assertEquals("XIV", RomanNumerals.convert_to_new_roman(14));
        assertEquals("XL", RomanNumerals.convert_to_new_roman(40));
        assertEquals("L", RomanNumerals.convert_to_new_roman(50));
        assertEquals("XC", RomanNumerals.convert_to_new_roman(90));
        assertEquals("C", RomanNumerals.convert_to_new_roman(100));
        assertEquals("CXXXI", RomanNumerals.convert_to_new_roman(131));
        assertEquals("CD", RomanNumerals.convert_to_new_roman(400));
        assertEquals("D", RomanNumerals.convert_to_new_roman(500));
        assertEquals("CM", RomanNumerals.convert_to_new_roman(900));
        assertEquals("M", RomanNumerals.convert_to_new_roman(1000));
    }
}
