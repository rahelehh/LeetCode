package hashmap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern_290 {


    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i=0; i<words.length; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        return true;
    }

    public boolean wordPattern1(String pattern, String s) {
        String[] words = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        if (pattern.length() != words.length)
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (!map.containsValue(words[i]))
                    map.put(pattern.charAt(i), words[i]);
                else
                    return false;
            } else if ((map.containsKey(pattern.charAt(i))) && !map.get(pattern.charAt(i)).equals(words[i]))
                return false;
        }
        return true;
    }
}
