package arrays;

import java.util.HashMap;

public class RomanToInteger_13 {

    public int romanToInt(String s) {
        int num = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                num -= map.get(s.charAt(i));
            } else {
                num += map.get(s.charAt(i));
            }
        }
        return num;
    }


    public int romanToInt1(String s) {
        int num = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if (i < length - 1 && s.charAt(i + 1) == 'V') {
                        num += 4;
                        i++;
                        break;
                    } else if (i < length - 1 && s.charAt(i + 1) == 'X') {
                        num += 9;
                        i++;
                        break;
                    } else {
                        num += 1;
                        break;
                    }
                case 'V':
                    num += 5;
                    break;
                case 'X':
                    if (i < length - 1 && s.charAt(i + 1) == 'L') {
                        num += 40;
                        i++;
                        break;
                    } else if (i < length - 1 && s.charAt(i + 1) == 'C') {
                        num += 90;
                        i++;
                        break;
                    } else {
                        num += 10;
                        break;
                    }
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    if (i < length - 1 && s.charAt(i + 1) == 'D') {
                        num += 400;
                        i++;
                        break;
                    } else if (i < length - 1 && s.charAt(i + 1) == 'M') {
                        num += 900;
                        i++;
                        break;
                    } else {
                        num += 100;
                        break;
                    }
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
            }
        }
        return num;
    }


    public int romanToInt2(String s) {
        int result = 0;
        char a, b = 0;
        String temp;
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("I", 1);
        hashMap.put("V", 5);
        hashMap.put("X", 10);
        hashMap.put("L", 50);
        hashMap.put("C", 100);
        hashMap.put("D", 500);
        hashMap.put("M", 1000);
        hashMap.put("IV", 4);
        hashMap.put("IX", 9);
        hashMap.put("XL", 40);
        hashMap.put("XC", 90);
        hashMap.put("CD", 400);
        hashMap.put("CM", 900);
        for (int i = 0; i < s.length(); i++) {
            a = s.charAt(i);
            if (i < s.length() - 1)
                b = s.charAt(i + 1);
            temp = String.valueOf(new StringBuilder().append(a).append(b));

            switch (temp) {
                case "IV":
                    result += hashMap.get("IV");
                    i++;
                    break;
                case "IX":
                    result += hashMap.get("IX");
                    i++;
                    break;
                case "XL":
                    result += hashMap.get("XL");
                    i++;
                    break;
                case "XC":
                    result += hashMap.get("XC");
                    i++;
                    break;
                case "CD":
                    result += hashMap.get("CD");
                    i++;
                    break;
                case "CM":
                    result += hashMap.get("CM");
                    i++;
                    break;
                default:
                    result += hashMap.get(String.valueOf(s.charAt(i)));
            }
        }

        return result;

    }
}
