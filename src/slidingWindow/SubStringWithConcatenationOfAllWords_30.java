package slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SubStringWithConcatenationOfAllWords_30 {
    public List<Integer> findSubstring(String s, String[] words) {
        int a_pointer = 0;
        int b_pointer = 0;
        int wordLength = words[0].length();
        int numOfWords = words.length;
        HashSet<String> hashSet = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        while (a_pointer < (s.length() - wordLength)) {
            for (int i = 0; i < numOfWords; i++) {
                if (b_pointer == s.length())
                    break;
                if (Arrays.stream(words).anyMatch(s.substring(b_pointer, b_pointer + wordLength)::equals)) {
                    hashSet.add(s.substring(b_pointer, b_pointer + wordLength));
                }
                b_pointer += wordLength;
            }
            if (hashSet.size() == numOfWords) {
                result.add(b_pointer - (numOfWords * wordLength));
            }
            hashSet.clear();
            b_pointer -= wordLength * (numOfWords - 1);
            a_pointer += wordLength;
        }
        for (Integer i : result) {
            System.out.println(i);
        }
        return result;
    }
}
