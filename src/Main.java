public class Main {
    public static void main(String[] args) {
        //***************************Merge_Sorted_Array**********************************
        System.out.println("****************** Merge_Sorted_Array ******************");
        MergeSortedArray_88 solution = new MergeSortedArray_88();
        int[] nums1 = {2, 2, 3, 4, 0, 0, 0};
        int[] nums2 = {1, 5, 6};
        int m = nums1.length - nums2.length;
        int n = nums2.length;
//        solution.merge(nums1, m, nums2, n);
        solution.merge_solution2(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.println(i);
        }
        //**********************************Remove Element**********************************
//        int nums[] = {0,1,2,2,3,0,4,2};
//        int val = 2;
//        RemoveElement_27 removeElement = new RemoveElement_27();
//        System.out.println("****************** Remove Element ******************\n" + removeElement.removeElement(nums, val));

        //********************************** Remove Duplicate From Sorted Array **********************************
//        int nums[] = {0,0,1,1,1,2,2,3,3,4};
//        RemoveDuplicatesFromSortedArray_26 removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray_26();
//        System.out.println("****************** Remove Duplicate From Sorted Array ******************\n" + removeDuplicatesFromSortedArray.removeDuplicates(nums));

        //********************************** Remove Duplicate From Sorted Array **********************************
//        int nums[] = {1,1,1,2,2,3};
//        RemoveDuplicatesFromSortedArrayII_80 removeDuplicatesFromSortedArrayII = new RemoveDuplicatesFromSortedArrayII_80();
//        System.out.println("****************** Remove Duplicate From Sorted Array ******************\n" + removeDuplicatesFromSortedArrayII.removeDuplicates(nums));

        //********************************** Majority Element **********************************
//        int nums[] = {2,2,3,5,6,2,2,3,6,2,2};
//        MajorityElement_169 majorityElement = new MajorityElement_169();
//        System.out.println("****************** Majority Element ******************\n" + majorityElement.majorityElement(nums));

        //********************************** Rotate Array **********************************
//        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        int k = 3;
//        RotateArray_189 rotateArray = new RotateArray_189();
//        System.out.println("****************** Rotate Array ******************\n");
//        rotateArray.rotate(nums, k);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

        //********************************** Best Time To Buy And Sell Stock **********************************
//        int[] prices = {7,1,5,3,6,4};
//        BestTimeToBuyAndSellStock_121 bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock_121();
//        System.out.println("****************** Best Time To Buy And Sell Stock ******************\n");
//        System.out.println(bestTimeToBuyAndSellStock.maxProfit(prices));


        //********************************** Best Time To Buy And Sell Stock II **********************************
//        int[] prices = {7,1,5,3,6,4};
//        int[] prices = {1,2,3,4,5};
        int[] prices = {6,1,3,2,4,7};
        BestTimeToBuyAndSellStock_II_122 bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStock_II_122();
        System.out.println("****************** Best Time To Buy And Sell Stock II ******************\n");
        System.out.println(bestTimeToBuyAndSellStockII.maxProfit(prices));
    }
}