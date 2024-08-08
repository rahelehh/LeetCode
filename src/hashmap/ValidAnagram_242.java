package hashmap;

import java.util.HashMap;

public class ValidAnagram_242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] char_count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char_count[s.charAt(i) - 'a']++;
            char_count[t.charAt(i) - 'a']--;
        }
        for (int i : char_count) {
            if (char_count[i] != 0)
                return false;
        }
        return true;
    }

    public boolean isAnagram1(String s, String t) {
        HashMap<Character, Integer> map_s = new HashMap();
        HashMap<Character, Integer> map_t = new HashMap();
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            char char_at_index_s = s.charAt(i);
            char char_at_index_t = t.charAt(i);
            if (map_s.containsKey(char_at_index_s))
                map_s.put(char_at_index_s, map_s.get(char_at_index_s) + 1);
            else
                map_s.put(char_at_index_s, 1);
            if (map_t.containsKey(char_at_index_t))
                map_t.put(char_at_index_t, map_t.get(char_at_index_t) + 1);
            else
                map_t.put(char_at_index_t, 1);
        }
        if (map_s.equals(map_t))
            return true;
        return false;
    }
}
