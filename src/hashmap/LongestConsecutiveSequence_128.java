package hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence_128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int length = 0;
        int longest = 0;
        for (int i : nums) {
            if (!set.contains(i - 1)) {
                length = 0;
                while (set.contains(i + length))
                    length++;
            }
            longest = Math.max(longest, length);
        }
        return longest;
    }
}
