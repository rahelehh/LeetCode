package arrays;

public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (majorityElement == nums[i])
                count++;
            else {
                if (count == 0) {
                    majorityElement = nums[i];
                    count = 1;
                }
                count--;
            }
        }
        return majorityElement;
    }
}
