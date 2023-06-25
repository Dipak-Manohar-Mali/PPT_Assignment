/*

Q8.You are given an integer array nums and an integer k.

In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.

The score of nums is the difference between the maximum and minimum elements in nums.

Return the minimum score of nums after applying the mentioned operation at most once for each index in it.

Example 1:
Input: nums = [1], k = 0
Output: 0

Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.

*/
//Time And Space Complexity is O(n) and O(1) respectively
class Solution8{
    public static int smallestRangeI(int[] nums, int k) {
        int min=nums[0];
        int max=nums[0];
        
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
        }
            min+=k;
            max-=k;
        
        return Math.max(0,max-min);
    }
    public static void main(String ar[])
    {
       int nums[]={0,10},k=2;
       System.out.println("Output: "+smallestRangeI(nums,k)); 
    }
}