package twoPointers;

public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\s","").toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        String reverse_s = new StringBuilder(s).reverse().toString();
        if(s.equals(reverse_s))
            return true;
        return false;
    }
}
