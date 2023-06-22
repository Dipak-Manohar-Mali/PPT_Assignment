/*
💡Q2. Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

- Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
- Return k.


*/


public class Solution2
{
   public static int replace(int nums[],int val)
   {
       int k=0;
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]!=val)
           {
                nums[k] = nums[i]; 
                k++;
           }
       }
       return k;
   }
      
    
	public static void main(String[] args) {
		int nums[]=new int[]{3,2,2,3};
		int val =3;
		int k=replace(nums,val);
		System.out.print("Output: " + k);
        System.out.print(",nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
	
		
	}
}