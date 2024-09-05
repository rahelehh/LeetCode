package math;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne_66 {
    public int[] plusOne(int[] digits) {

        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

        public int[] plusOne2(int[] digits) {
        int n = digits.length - 1;
        int m = digits.length;
        int[] out = new int[m + 1];
        int i = n;
        for (; i >= 0; i--) {
            digits[i] = digits[i] + 1;
            if (digits[i] == 10) {
                digits[i] = 0;
                continue;
            } else
                break;
        }
        if (digits[0] == 0) {
            for (int j = m - 1; j >= 0; j--) {
                out[m] = digits[j];
            }
            out[0] = 1;
        } else {
            out = digits;
            return out;
        }
        return out;
    }
}
