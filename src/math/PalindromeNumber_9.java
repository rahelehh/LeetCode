package math;

public class PalindromeNumber_9 {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }

    public boolean isPalindrome1(int x) {
        if (x < 0)
            return false;
        int length = (int) Math.log10(x) + 1;
        int xa = x;
        int j = 1;
        int y = 0;
        while (x != 0) {
            y += (x % 10) * Math.pow(10, length - j);
            x /= 10;
            j++;
        }
        y += x % 10;
        if (xa == y)
            return true;
        return false;
    }


    public boolean isPalindrome_previous(int x) {
        if (x < 0)
            return false;
        else {
            int xa = x;
            int length = (int) Math.log10(x) + 1;
            int b = 0;
            int[] a = new int[10];
            int i = 0;
            while (x / 10 != 0) {
                a[i] = x % 10;
                x = x / 10;
                b += a[i] * Math.pow(10, length - i - 1);
                i++;
            }
            b += x % 10;
            if (b == xa)
                return true;
            return false;
        }
    }
}
