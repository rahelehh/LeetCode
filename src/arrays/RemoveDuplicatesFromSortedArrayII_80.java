package arrays;

public class RemoveDuplicatesFromSortedArrayII_80 {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;
        if (nums.length == 2)
            return 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }else if(k!=i){
                if(nums[i] != nums[k-2]){
                    nums[k] = nums[i];
                    k++;
                }
            }else {
                if(nums[i]!=nums[i-2]){
                    nums[k] = nums[i];
                    k++;
                }
            }
        }
        return k;
    }
}
