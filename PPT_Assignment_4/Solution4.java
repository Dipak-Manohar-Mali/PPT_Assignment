/*


Q4.Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is **maximized**. Return *the maximized sum*.

**Example 1:**

Input: nums = [1,4,3,2]

Output: 4

*/

import java.util.*;

class Solution4 {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2)
        {
        
                sum+=nums[i];
            
        }
        return sum;
    }
	public static void main(String ar[])
	{

	   int nums[]={1,4,3,2};
	   System.out.println(arrayPairSum(nums));
	}
}