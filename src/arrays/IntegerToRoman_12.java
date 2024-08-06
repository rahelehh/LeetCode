package arrays;

import java.util.HashMap;

public class IntegerToRoman_12 {
    public String intToRoman(int num) {
        int[] n = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] s = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i = 0;
        String str = new String();
        while (num > 0) {
            if (num >= n[i]) {
                str = str + s[i];
                num -= n[i];
            } else {
                i++;
            }
        }
        return str;
    }

    public String intToRoman1(int num) {
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        int numerOfDigits = (int) (Math.log10(num)) + 1;
        for (int i = numerOfDigits; i > 0; i--) {
            int powNumRoman = (int) (Math.pow(10, (i - 1)));
            int numOfRoman = num / powNumRoman;
            if (numOfRoman == 4 || numOfRoman == 9) {
                sb.append(map.get(powNumRoman));
                numOfRoman++;
                sb.append(map.get(numOfRoman * powNumRoman));
            } else {
                if (numOfRoman <= 3) {
                    sb.append(map.get(powNumRoman).repeat(numOfRoman));
                } else {
                    sb.append(map.get(5 * powNumRoman));
                    sb.append(map.get(powNumRoman).repeat(numOfRoman - 5));
                }
            }
            num = num % powNumRoman;
        }
        return sb.toString();
    }

    public String intToRoman2(int num) {
        String roman = "";
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Character> map = new HashMap<>();
        map.put(1, 'I');
        map.put(5, 'V');
        map.put(10, 'X');
        map.put(50, 'L');
        map.put(100, 'C');
        map.put(500, 'D');
        map.put(1000, 'M');
        int numerOfDigits = (int) (Math.log10(num)) + 1;
        for (int i = numerOfDigits; i > 0; i--) {
            int powNumRoman = (int) (Math.pow(10, (i - 1)));
            int numOfRoman = num / powNumRoman;
            if (numOfRoman == 4 || numOfRoman == 9) {
                sb.append(map.get(powNumRoman));
                numOfRoman++;
                sb.append(map.get(numOfRoman * powNumRoman));
            } else {
                if (numOfRoman <= 3) {
                    while (numOfRoman > 0) {
                        sb.append(map.get(powNumRoman));
                        numOfRoman--;
                    }
                } else {
                    int j = 5;
                    sb.append(map.get(j * powNumRoman));
                    int subtraction = (numOfRoman - j);
                    while (j <= numOfRoman && subtraction > 0) {
                        sb.append(map.get(powNumRoman));
                        subtraction--;
                        j++;
                    }
                }
            }
            num = num % powNumRoman;
        }
        return sb.toString();
    }


}
