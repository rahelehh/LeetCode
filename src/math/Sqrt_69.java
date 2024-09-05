package math;

public class Sqrt_69 {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        int start = 1;
        int mid = 0;
        int end = x;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid < x / mid)
                start = mid + 1;
            else if (mid > x / mid)
                end = mid - 1;
            else return mid;
        }
        return end;
    }
}
