package slidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChars_3 {
    public int lengthOfLongestSubstring(String s) {
        String subString = "";
        int maxLength = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (subString.contains(String.valueOf(s.charAt(i)))) {
                start = subString.indexOf(String.valueOf(s.charAt(i)));
                subString = subString.substring(start + 1);
            }
            subString += s.charAt(i);
            maxLength = Math.max(maxLength, subString.length());
        }
        return maxLength;
    }


    public int lengthOfLongestSubstring2(String s) {
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;
        HashSet<Character> hashSet = new HashSet<>();
        while (b_pointer < s.length()) {
            if (!hashSet.contains(s.charAt(b_pointer))) {
                hashSet.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(max, hashSet.size());
            } else {
                hashSet.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        System.out.println(hashSet);
        return max;
    }
}
