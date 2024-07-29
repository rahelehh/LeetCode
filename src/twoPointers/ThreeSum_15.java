package twoPointers;

import java.util.*;

public class ThreeSum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int j, k, sum = 0;
        List<List<Integer>> output = new ArrayList<>();
        Set<List<Integer>> resultSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            j = i + 1;
            k = nums.length - 1;
            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];
                if (total == sum) {
                    resultSet.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (total < sum)
                    j++;
                else
                    k--;
            }
        }
        output.addAll(resultSet);
        return output;
    }
}
