package slidingWindow;

public class MinimumSizeSubarraySum_209 {
    public int minSubArrayLen(int target, int[] nums) {
        int total = 0;
        int start = 0;
        int min_val = Integer.MAX_VALUE;
        for (int end = 0; end < nums.length; end++) {
            total += nums[end];
            while (total >= target) {
                min_val = Math.min(min_val, end - start + 1);
                total -= nums[start];
                start++;
            }
        }
        return min_val == Integer.MAX_VALUE ? 0 : min_val;
    }
}
