/*
💡 Q7. Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

Note that you must do this in-place without making a copy of the array.

*/

public class Solution7
{
	public static void main(String[] args) {
		int nums[] = {0,1,0,3,12};
		int j=0;
		for(int i=0;i<nums.length;i++)
		{
		    if(nums[i]!=0)
		    {
		        int temp=nums[i];
		        nums[i]=nums[j];
		        nums[j]=temp;
		        j++;
		    }
		}
		System.out.print("["+nums[0]);
		for(int i=1;i<nums.length;i++)
		{
		    System.out.print(","+nums[i]);
		}
		System.out.println("]");
	}
}
