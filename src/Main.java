import arrays.MergeSortedArray_88;
import hashmap.TwoSum_1;
import slidingWindow.LongestSubstringWithoutRepeatingChars_3;
import slidingWindow.SubStringWithConcatenationOfAllWords_30;
import twoPointers.IsSubsequence_392;
import twoPointers.ThreeSum_15;
import twoPointers.TwoSumII_167;

import java.util.Arrays;
import java.util.HashMap;

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
//        arrays.RemoveElement_27 removeElement = new arrays.RemoveElement_27();
//        System.out.println("****************** Remove Element ******************\n" + removeElement.removeElement(nums, val));

        //********************************** Remove Duplicate From Sorted Array **********************************
//        int nums[] = {0,0,1,1,1,2,2,3,3,4};
//        arrays.RemoveDuplicatesFromSortedArray_26 removeDuplicatesFromSortedArray = new arrays.RemoveDuplicatesFromSortedArray_26();
//        System.out.println("****************** Remove Duplicate From Sorted Array ******************\n" + removeDuplicatesFromSortedArray.removeDuplicates(nums));

        //********************************** Remove Duplicate From Sorted Array **********************************
//        int nums[] = {1,1,1,2,2,3};
//        arrays.RemoveDuplicatesFromSortedArrayII_80 removeDuplicatesFromSortedArrayII = new arrays.RemoveDuplicatesFromSortedArrayII_80();
//        System.out.println("****************** Remove Duplicate From Sorted Array ******************\n" + removeDuplicatesFromSortedArrayII.removeDuplicates(nums));

        //********************************** Majority Element **********************************
//        int nums[] = {2,2,3,5,6,2,2,3,6,2,2};
//        arrays.MajorityElement_169 majorityElement = new arrays.MajorityElement_169();
//        System.out.println("****************** Majority Element ******************\n" + majorityElement.majorityElement(nums));

        //********************************** Rotate Array **********************************
//        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        int k = 3;
//        arrays.RotateArray_189 rotateArray = new arrays.RotateArray_189();
//        System.out.println("****************** Rotate Array ******************\n");
//        rotateArray.rotate(nums, k);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

        //********************************** Best Time To Buy And Sell Stock **********************************
//        int[] prices = {7,1,5,3,6,4};
//        arrays.BestTimeToBuyAndSellStock_121 bestTimeToBuyAndSellStock = new arrays.BestTimeToBuyAndSellStock_121();
//        System.out.println("****************** Best Time To Buy And Sell Stock ******************\n");
//        System.out.println(bestTimeToBuyAndSellStock.maxProfit(prices));


        //********************************** Best Time To Buy And Sell Stock II **********************************
//        int[] prices = {7,1,5,3,6,4};
//        int[] prices = {1,2,3,4,5};
//        int[] prices = {6,1,3,2,4,7};
//        BestTimeToBuyAndSellStock_II_122 bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStock_II_122();
//        System.out.println("****************** Best Time To Buy And Sell Stock II ******************\n");
//        System.out.println(bestTimeToBuyAndSellStockII.maxProfit(prices));


        //********************************** Valid Palindrome **********************************
//        String s = "race a car";
//        ValidPalindrome_125 validPalindrome = new ValidPalindrome_125();
//        System.out.println("****************** Valid Palindrome ******************\n");
//        System.out.println(validPalindrome.isPalindrome(s));

        //********************************** Minimum Size Subarray Sum **********************************
//        int[] nums = {2, 3, 1, 2, 4, 3};
//        int target = 7;
//        MinimumSizeSubarraySum_209 minimumSizeSubarraySum = new MinimumSizeSubarraySum_209();
//        System.out.println("****************** Minimum Size Subarray Sum ******************\n");
//        System.out.println(minimumSizeSubarraySum.minSubArrayLen(target, nums));



        //********************************** Longest Substring Without Repeating Characters **********************************
//        String s = "abcabcbb";
//        LongestSubstringWithoutRepeatingChars_3 longestSubstringWithoutRepeatingChars = new LongestSubstringWithoutRepeatingChars_3();
//        System.out.println("****************** Longest Substring Without Repeating Characters ******************\n");
//        System.out.println(longestSubstringWithoutRepeatingChars.lengthOfLongestSubstring2(s));


        //********************************** SubString With Concatenation Of All Words **********************************
//        String s = "wordgoodgoodgoodbestword";
//        String[] words = {"word","good","best","good"};
//        SubStringWithConcatenationOfAllWords_30 subStringWithConcatenationOfAllWords = new SubStringWithConcatenationOfAllWords_30();
//        System.out.println("****************** SubString With Concatenation Of All Words ******************\n");
//        System.out.println(subStringWithConcatenationOfAllWords.findSubstring(s,words));
//

        //********************************** Is Subsequence **********************************
//        String s = "axc";
//        String t = "ahbgdc";
//        IsSubsequence_392 isSubsequence = new IsSubsequence_392();
//        System.out.println("****************** Is Subsequence ******************\n");
//        System.out.println(isSubsequence.isSubsequence(s,t));


        //********************************** Two Sum **********************************
//        int []nums = {2,7,11,15};
//        int target = 6;
//        TwoSum_1 twoSum = new TwoSum_1();
//        System.out.println("****************** Two Sum ******************\n");
//        System.out.println(twoSum.twoSum_hashmap(nums,target));



        //********************************** Two Sum II **********************************
//        int []nums = {2,7,11,15};
//        int target = 9;
//        TwoSumII_167 twoSum = new TwoSumII_167();
//        System.out.println("****************** Two Sum II ******************\n");
//        int [] twoSumOutput = twoSum.twoSum(nums,target);
//        for (int i : twoSumOutput) {
//            System.out.println(i);
//        }


        //********************************** 3 Sum **********************************
        int []nums = {18, -2, -4 , 0,7,11,15};
        ThreeSum_15 threeSum = new ThreeSum_15();
        System.out.println("****************** 3 Sum ******************\n");
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }

    }
}