package arrays;

public class FindTheIndexOfFirstOccuranceOfString_28 {
    public int strStr(String haystack, String needle) {
        if (haystack.contains(needle))
            return haystack.indexOf(needle);
        return -1;
    }
}
