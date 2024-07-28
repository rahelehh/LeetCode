package hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public int[] twoSum_brute_force(int[] nums, int target) {
        int[] result = new int[2];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            j = i + 1;
            while (j < nums.length) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
                j++;
            }
        }
        return result;
    }

    public int[] twoSum_hashmap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement))
                return new int[] {map.get(complement), i};
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
