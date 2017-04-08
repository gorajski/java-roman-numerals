import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by nick on 4/7/17.
 */
public class RomanNumerals {
    public static void main(String[] args) {
        System.out.println(convert_to_old_roman(444));
        System.out.println(convert_to_new_roman(444));
    }

    public static String convert_to_old_roman(Integer input) {
        String output = "";
        Map<Integer, String> conversionTable = new LinkedHashMap<Integer, String>();
        conversionTable.put(1000, "M");
        conversionTable.put(500, "D");
        conversionTable.put(100, "C");
        conversionTable.put(50, "L");
        conversionTable.put(10, "X");
        conversionTable.put(5, "V");
        conversionTable.put(1, "I");

        Integer numberOfChars;
        String charBlock;
        for (Integer key : conversionTable.keySet()) {
            if (input >= key) {
                numberOfChars = input / key;
                charBlock = new String(new char[numberOfChars]).replace("\0", conversionTable.get(key));
                output += charBlock;
                input -= key * numberOfChars;
            }
        }
        return output;
    }

    public static String convert_to_new_roman(Integer input) {
        String output = "";
        Map<Integer, String> conversionTable = new LinkedHashMap<Integer, String>();
        conversionTable.put(1000, "M");
        conversionTable.put(500, "D");
        conversionTable.put(400, "CD");
        conversionTable.put(100, "C");
        conversionTable.put(50, "L");
        conversionTable.put(40, "XL");
        conversionTable.put(10, "X");
        conversionTable.put(5, "V");
        conversionTable.put(4, "IV");
        conversionTable.put(1, "I");

        Integer numberOfChars;
        String charBlock;
        for (Integer key : conversionTable.keySet()) {
            if (input >= key) {
                numberOfChars = input / key;
                charBlock = new String(new char[numberOfChars]).replace("\0", conversionTable.get(key));
                output += charBlock;
                input -= key * numberOfChars;
            }
        }
        return output;
    }
}
