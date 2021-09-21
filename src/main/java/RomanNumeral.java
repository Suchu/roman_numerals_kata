import java.util.TreeMap;

public class RomanNumeral {

    TreeMap<Integer, String> romanNumeralMap = new TreeMap<>() {
        {
            put(1, "I");

            put(4, "IV");

            put(5, "V");

            put(9, "IX");

            put(10, "X");

            put(50, "L");

            put(90, "XC");

            put(100, "C");

            put(500, "D");

            put(900, "CM");

            put(1000, "M");
        }
    };

    public String convertToRoman(int number) {
        String key = romanNumeralMap.get(number);
        Integer lowerKey = romanNumeralMap.lowerKey(number);
        if (key != null) {
            return romanNumeralMap.get(number);
        }
        return romanNumeralMap.get(lowerKey) + convertToRoman(number - lowerKey);
    }
}
