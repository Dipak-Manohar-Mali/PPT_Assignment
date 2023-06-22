/*
💡 Q3. Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity

*/


public class Solution3
{
   public static int search(int nums[],int target)
   {
       int low=0,high=nums.length-1,flag=0,i,mid=0;
       
       for(i=0;i<nums.length;i++)
       {
           mid=low+(high-low)/2;
           
           if(nums[mid]==target)
           {
               flag=1;
               break;
           }else if(nums[mid]<target)
           {
               low=mid+1;
           }else if(nums[mid]>target)
           {
               high=mid-1;
           }
           
       }
       if(flag==1)
       {
         return mid;  
       }else
       {
          return low;
       }
       
   }
      
    
	public static void main(String[] args) {
		int nums[]=new int[]{1,3,5,6};
		int target =5;
		int k=search(nums,target);
		
	
        System.out.println("Output :"+k);
        
	
		
	}
}
