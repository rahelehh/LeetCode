package twoPointers;

public class IsSubsequence_392 {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        if(s.length()==0)
            return true;
        for (int i = 0; i < t.length();i++) {
            if(t.charAt(i)  != s.charAt(j))
                continue;
            j++;
            if(j>=s.length())
                break;
        }
        if(j==s.length())
            return true;
        return false;
    }
}
