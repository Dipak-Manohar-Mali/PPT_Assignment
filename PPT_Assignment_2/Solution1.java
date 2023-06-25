/*

Q1.Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2),..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

*/

//Time Complexity O(nlogn) and Space Complexity O(1).

import java.util.*;

public class Solution1
{
    public static int MaximizedSum(int arr[])
    {
        Arrays.sort(arr);
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                max+=arr[i];
            }
        }
        return max;
    }
	public static void main(String[] args) {
		int nums[]={1,4,3,2};
		System.out.println("Output: "+MaximizedSum(nums));
		
	}
}
