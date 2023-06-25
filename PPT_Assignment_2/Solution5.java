/*

Q5.Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

*/

import java.util.*;

class Solution5{


    public static int maximumProduct(int[] nums) {
            
        Arrays.sort(nums);
        int n = nums.length;
        int p1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int p2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(p1, p2);
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size OF Array:\n");
		int n=sc.nextInt();
		System.out.println("Enter array Element :\n");
		int nums[]=new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}
		System.out.println("Output: "+maximumProduct(nums));
		
	}
}