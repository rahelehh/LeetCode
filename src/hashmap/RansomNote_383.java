package hashmap;

public class RansomNote_383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];

        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;
    }

    public boolean canConstruct1(String ransomNote, String magazine) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append(magazine);
        int i = 0;
        for (i = 0; i < ransomNote.length(); i++) {
            if (sb1.toString().contains(String.valueOf(ransomNote.charAt(i)))) {
                sb1.deleteCharAt(sb1.indexOf(String.valueOf(ransomNote.charAt(i))));
            }
            else
                break;
        }
        if (i == ransomNote.length())
            return true;
        return false;
    }
}
