import arrays.*;
import binarytree.InvertBinaryTree_226;
import binarytree.MaximumDepthOfBinaryTree_104;
import binarytree.SameTree_100;
import binarytree.SymmetricTree_101;
import hashmap.*;
import intervals.SummaryRanges_228;
import linklist.MergeTwoSortedList_21;
import linklist.MergeTwoSortedList_21.*;
import org.w3c.dom.css.CSSMediaRule;

import java.security.KeyPair;
import java.util.*;


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
//        int []nums = {18, -2, -4 , 0,7,11,15};
//        ThreeSum_15 threeSum = new ThreeSum_15();
//        System.out.println("****************** 3 Sum ******************\n");
//        Arrays.sort(nums);
//        for (int num : nums) {
//            System.out.println(num);
//        }


        //********************************** Validate Sudoku **********************************
//        char [][]board ={
//                {'5','3','.','.','7','.','.','.','.'}
//                ,{'6','.','.','1','9','5','.','.','.'}
//                ,{'.','9','8','.','.','.','.','6','.'}
//                ,{'8','.','.','.','6','.','.','.','3'}
//                ,{'4','.','.','8','.','3','.','.','1'}
//                ,{'7','.','.','.','2','.','.','.','6'}
//                ,{'.','6','.','.','.','.','2','8','.'}
//                ,{'.','.','.','4','1','9','.','.','5'}
//                ,{'.','.','.','.','8','.','.','7','9'}};
//
//
//        ValidSudoku_36 validSudoku = new ValidSudoku_36();
//        System.out.println("****************** Validate Sudoku ******************\n");
//        System.out.println(validSudoku.isValidSudoku(board));


        //********************************** Sprial Matrix**********************************
//        int [][]matrix ={{1,2,3,4,5}, {6,7,8,9,10},{11,12,13,14,15}};
//        SprialMatrix_54 sprialMatrix = new SprialMatrix_54();
//        System.out.println("****************** Sprial Matrix ******************\n");
//        System.out.println(sprialMatrix.spiralOrder(matrix));


        //********************************** Find the Index of the First Occurrence in a String **********************************
//        String haystack = "asadbutsad", needle = "sad";
//        FindTheIndexOfFirstOccuranceOfString_28 occurance = new FindTheIndexOfFirstOccuranceOfString_28();
//        System.out.println("****************** Find the Index of the First Occurrence in a String ******************\n");
//        System.out.println(occurance.strStr(haystack, needle));


        //********************************** Zigzag Conversion **********************************
//        String s = "ABC";
//        int numRows = 2;
//        ZigzagConversion_6 zigzagConversion = new ZigzagConversion_6();
//        System.out.println("******************  Zigzag Conversion ******************\n");
//        System.out.println(zigzagConversion.convert(s, numRows));


        //********************************** Jump Game **********************************
//        int[] nums={1,1,2,2,0,1,1};
//        JumpGame_55 jumpGame55 = new JumpGame_55();
//        System.out.println("******************  Jump Game ******************\n");
//        System.out.println(jumpGame55.canJump(nums));

        //********************************** Roman To Integer **********************************
//        String s = "CMXCVIII";
//        RomanToInteger_13 romanToInteger13 = new RomanToInteger_13();
//        System.out.println("******************  Roman To Integer ******************\n");
//        System.out.println(romanToInteger13.romanToInt(s));

        //********************************** Merge Intervals **********************************
//        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
//        MergeIntervals_56 mergeIntervals56 = new MergeIntervals_56();
//        System.out.println("******************  Merge Intervals ******************\n");
//        System.out.println(mergeIntervals56.merge(intervals));


        //********************************** Integer To Roman **********************************
//        int num = 3749;
//        IntegerToRoman_12 integerToRoman = new IntegerToRoman_12();
//        System.out.println("****************** Integer To Roman ******************\n");
//        System.out.println(integerToRoman.intToRoman(num));


        //********************************** Longest Consecutive Sequence **********************************
//        int []nums = {0,3,7,2,5,8,4,6,0,1};
//        LongestConsecutiveSequence_128 longestConsecutiveSequence = new LongestConsecutiveSequence_128();
//        System.out.println("******************  Longest Consecutive Sequence ******************\n");
//        System.out.println(longestConsecutiveSequence.longestConsecutive(nums));


        //********************************** Happy Number **********************************
//        int num = 2;
//        HappyNumber_202 happyNumber = new HappyNumber_202();
//        System.out.println("******************  Happy Number ******************\n");
//        System.out.println(happyNumber.isHappy(num));


        //********************************** Ransom Note **********************************
//        String ransomNoteStr="fihjjjjei";
//        String magazine="hjibagacbhadfaefdjaeaebgi";
//        RansomNote_383 ransomNote = new RansomNote_383();
//        System.out.println("****************** Ransom Note ******************\n");
//        System.out.println(ransomNote.canConstruct(ransomNoteStr,magazine));

        //********************************** Isomorphic String **********************************
//        String s="badc";
//        String t="baba";
//        IsomorphicString_205 isomorphicString = new IsomorphicString_205();
//        System.out.println("****************** Isomorphic String  ******************\n");
//        System.out.println(isomorphicString.isIsomorphic(s,t));

        //********************************** Valid Parantheses **********************************
//        String s=")(){}";
//        ValidParantheses_20 validParantheses = new ValidParantheses_20();
//        System.out.println("****************** Valid Parantheses ******************\n");
//        System.out.println(validParantheses.isValid(s));


        //********************************** Valid Anagram **********************************
//        String s="anagram";
//        String t="agranam";
//        ValidAnagram_242 validAnagram = new ValidAnagram_242();
//        System.out.println("****************** Valid Anagram ******************\n");
//        System.out.println(validAnagram.isAnagram(s,t));


        //********************************** Group Anagram **********************************
//        String[] s= {"abets","bead","remain","betas","abed","baste","airline","leading","beast","dealing","beats","airmen","marine","single","bade","aligned"};
//        GroupAnagram_49 groupAnagram = new GroupAnagram_49();
//        System.out.println("****************** Group Anagram ******************\n");
//        System.out.println(groupAnagram.groupAnagrams(s));


        //********************************** Word Pattern **********************************
//        String pattern = "abba";
//        String s = "dog dog dog dog";
//        WordPattern_290 wordPattern = new WordPattern_290();
//        System.out.println("****************** Word Pattern ******************\n");
//        System.out.println(wordPattern.wordPattern(pattern,s));

        //********************************** Length of Last Word **********************************
//        String s = "Hello World";
//        LengthOfLastWord_58 lengthOfLastWord = new LengthOfLastWord_58();
//        System.out.println("****************** Length of Last Word ******************\n");
//        System.out.println(lengthOfLastWord.lengthOfLastWord(s));


        //********************************** Longest Common Prefix **********************************
//        String[] s = {"dog","racecar","car"};
//        LongestCommonPrefix_14 longestCommonPrefix = new LongestCommonPrefix_14();
//        System.out.println("****************** Longest Common Prefix ******************\n");
//        System.out.println(longestCommonPrefix.longestCommonPrefix(s));


        //********************************** Merge Two Sorted List **********************************
//        ListNode n1=new ListNode(1, new ListNode());
//        ListNode n2=new ListNode(2,n1);
//        ListNode n3=new ListNode(4,n2);
//        ListNode list1 = n1;
//
//        ListNode n4=new ListNode(1, new ListNode());
//        ListNode n5=new ListNode(2,n1);
//        ListNode n6=new ListNode(4,n2);
//        ListNode list2 = n4;
//
//        MergeTwoSortedList_21 mergeTwoSortedList = new MergeTwoSortedList_21();
//        System.out.println("****************** Merge Two Sorted List ******************\n");
//        mergeTwoSortedList.mergeTwoLists(list1,list2);


        //********************************** Summary Ranges **********************************
//        int[] nums = {0,1,2,4,5,7};
//        SummaryRanges_228 summaryRanges = new SummaryRanges_228();
//        System.out.println("****************** Summary Ranges ******************\n");
//        System.out.println(summaryRanges.summaryRanges(nums));

        //********************************** Merge Intervals **********************************
//        int[][] intervals = {{1,4},{0,0}};
//        MergeIntervals_56 mergeIntervals = new MergeIntervals_56();
//        System.out.println("****************** Merge Intervals ******************\n");
//        System.out.println(mergeIntervals.merge(intervals));

        //********************************** Maximum Depth Of Binary Tree **********************************
//        MaximumDepthOfBinaryTree_104.TreeNode child_right_left = new MaximumDepthOfBinaryTree_104.TreeNode(15, null, null);
//        MaximumDepthOfBinaryTree_104.TreeNode child_right_right = new MaximumDepthOfBinaryTree_104.TreeNode(7, null, null);
//        MaximumDepthOfBinaryTree_104.TreeNode left = new MaximumDepthOfBinaryTree_104.TreeNode(9, null, null);
//        MaximumDepthOfBinaryTree_104.TreeNode right = new MaximumDepthOfBinaryTree_104.TreeNode(20, child_right_left, child_right_right);
//        MaximumDepthOfBinaryTree_104.TreeNode root = new MaximumDepthOfBinaryTree_104.TreeNode(3, left,right);
//        MaximumDepthOfBinaryTree_104 maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree_104();
//        System.out.println("****************** Maximum Depth Of Binary Tree ******************\n");
//        System.out.println(maximumDepthOfBinaryTree.maxDepth_DFS(root));


        //********************************** Same Tree **********************************
//        SameTree_100.TreeNode left_p = new SameTree_100.TreeNode(2, null, null);
//        SameTree_100.TreeNode right_p = new SameTree_100.TreeNode(3, null, null);
//        SameTree_100.TreeNode p = new SameTree_100.TreeNode(1, left_p, right_p);
//
//        SameTree_100.TreeNode left_q = new SameTree_100.TreeNode(2, null, null);
//        SameTree_100.TreeNode right_q = new SameTree_100.TreeNode(3, null, null);
//        SameTree_100.TreeNode q = new SameTree_100.TreeNode(1, left_q, right_q);
//
//
////        SameTree_100.TreeNode left_p = new SameTree_100.TreeNode(2, null, null);
////        SameTree_100.TreeNode p = new SameTree_100.TreeNode(1, left_p, null);
////
////        SameTree_100.TreeNode right_q = new SameTree_100.TreeNode(2, null, null);
////        SameTree_100.TreeNode q = new SameTree_100.TreeNode(1, null, right_q);
//
//        SameTree_100 sameTree = new SameTree_100();
//        System.out.println("****************** Same Tree ******************\n");
//        System.out.println(sameTree.isSameTree_DFS(p, q));



        //********************************** Invert Binary Tree **********************************
//        InvertBinaryTree_226.TreeNode child_left_left = new InvertBinaryTree_226.TreeNode(1, null, null);
//        InvertBinaryTree_226.TreeNode child_left_right = new InvertBinaryTree_226.TreeNode(3, null, null);
//
//        InvertBinaryTree_226.TreeNode child_right_left = new InvertBinaryTree_226.TreeNode(6, null, null);
//        InvertBinaryTree_226.TreeNode child_right_right = new InvertBinaryTree_226.TreeNode(9, null, null);
//
//        InvertBinaryTree_226.TreeNode left = new InvertBinaryTree_226.TreeNode(2, child_left_left, child_left_right);
//        InvertBinaryTree_226.TreeNode right = new InvertBinaryTree_226.TreeNode(7, child_right_left, child_right_right);
//
//        InvertBinaryTree_226.TreeNode root = new InvertBinaryTree_226.TreeNode(4, left,right);
//        InvertBinaryTree_226 invertBinaryTree = new InvertBinaryTree_226();
//        System.out.println("****************** Invert Binary Tree ******************\n");
//        System.out.println(invertBinaryTree.invertTree(root));


        //********************************** Symmetric Tree **********************************
//        SymmetricTree_101.TreeNode child_left_left = new SymmetricTree_101.TreeNode(3, null, null);
//        SymmetricTree_101.TreeNode child_left_right = new SymmetricTree_101.TreeNode(4, null, null);
//
//        SymmetricTree_101.TreeNode child_right_left = new SymmetricTree_101.TreeNode(4, null, null);
//        SymmetricTree_101.TreeNode child_right_right = new SymmetricTree_101.TreeNode(3, null, null);
//
//        SymmetricTree_101.TreeNode left = new SymmetricTree_101.TreeNode(2, child_left_left, child_left_right);
//        SymmetricTree_101.TreeNode right = new SymmetricTree_101.TreeNode(2, child_right_left, child_right_right);
//
//        SymmetricTree_101.TreeNode root = new SymmetricTree_101.TreeNode(1, left,right);


        SymmetricTree_101.TreeNode child_left_right = new SymmetricTree_101.TreeNode(3, null, null);

        SymmetricTree_101.TreeNode child_right_right = new SymmetricTree_101.TreeNode(3, null, null);

        SymmetricTree_101.TreeNode left = new SymmetricTree_101.TreeNode(2, null, child_left_right);
        SymmetricTree_101.TreeNode right = new SymmetricTree_101.TreeNode(2, null, child_right_right);

        SymmetricTree_101.TreeNode root = new SymmetricTree_101.TreeNode(1, left,right);

        SymmetricTree_101 symmetricTree = new SymmetricTree_101();
        System.out.println("****************** Symmetric Tree  ******************\n");
        System.out.println(symmetricTree.isSymmetric(root));


    }
}