/*

Q7.An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.
*/


class Solution7{
    public static boolean isMonotonic(int[] nums) {
        boolean decreasing=false;
        boolean increasing=false;
       for(int i=1;i<nums.length;i++)
       {
           if(nums[i] > nums[i-1]){
               increasing=true;
           }
           else if(nums[i] < nums[i-1]){
               decreasing=true;
           }
           
       }
        boolean result = (increasing && decreasing) ? false:true;
        return result;

    }

	public static void main(String arg[])
	{

		int nums[]={1,2,2,3};
		System.out.println("Output:"+isMonotonic(nums));
	}
}