/*

Q3.We define a harmonious array as an array where the difference between its maximum value
and its minimum value is exactly 1.

Given an integer array nums, return the length of its longest harmonious subsequence
among all its possible subsequences.

A subsequence of an array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.

Example 1:
Input: nums = [1,3,2,2,5,2,3,7]
Output: 5

Explanation: The longest harmonious subsequence is [3,2,2,2,3].

*/
//Time Complexity: O(nlogn)  And Space Complexity: O(1).

import java.util.*;
class Solution3
{
    public static int findLHS(int[] nums) {
        Arrays.sort(nums);		//O(nlogn)
        int left=0,right=1;
        int result=0;
        while(right<nums.length)
        {
            int diff=nums[right]-nums[left];
            if(diff==1)
            {
                result=Math.max(result,right-left+1);
            }
            if(diff<=1)
            {
                right++;
            }
            else
            {
                left++;
            }
        }
        return result;
    }
    public static void main(String arg[])
    {

	int nums[]={1,3,2,2,5,2,3,7};
	System.out.println("Longest Harmonious subsequence length is: "+findLHS(nums));
	
        
    }
}