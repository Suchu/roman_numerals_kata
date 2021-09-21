import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {

    @Test
    public void numeralToRoman() {
        RomanNumeral toRoman = new RomanNumeral();
        assertEquals("I", toRoman.convertToRoman(1));
        assertEquals("V", toRoman.convertToRoman(5));
        assertEquals("X", toRoman.convertToRoman(10));
        assertEquals("L", toRoman.convertToRoman(50));
        assertEquals("C", toRoman.convertToRoman(100));
        assertEquals("D", toRoman.convertToRoman(500));
        assertEquals("M", toRoman.convertToRoman(1000));
    }

    @Test
    public void numeralToRomanForTwoDigit() {
        RomanNumeral toRoman = new RomanNumeral();
        assertEquals("II", toRoman.convertToRoman(2));
        assertEquals("XX", toRoman.convertToRoman(20));
    }

    @Test
    public void numeralToRomanSpecialDigit() {
        RomanNumeral toRoman = new RomanNumeral();
        assertEquals("IV", toRoman.convertToRoman(4));
        assertEquals("CIV", toRoman.convertToRoman(104));
        assertEquals("XCVI", toRoman.convertToRoman(96));
        assertEquals("CXXIV", toRoman.convertToRoman(124));
    }

    @Test
    public void numeralToRomanForThreeDigit() {
        RomanNumeral toRoman = new RomanNumeral();
        assertEquals("XXX", toRoman.convertToRoman(30));
    }
}
