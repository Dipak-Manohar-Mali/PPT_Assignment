/*
 Q1. Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/


//time complexity of the code is O(n^2) and the space complexity is O(1).

public class Solution1
{
    public static int[] twoElementAdd(int arr[],int target)
    {
        int temp[]=new int[2];
       for(int i=0;i<arr.length;i++)
       {
           for(int j=i+1;j<arr.length;j++)
           {
               if(target==(arr[i]+arr[j]))
               {
                  temp[0]=i;
		  temp[1]=j;
                  break;
               }
               
           }
       }
       return temp;
      
    }
	public static void main(String[] args) {
		int arr[]=new int[]{2,7,11,15};
		int target =9;
		int arr1[]=twoElementAdd(arr,target);
		for(int i=0;i<arr1.length;i++){
		System.out.print(arr1[i]+" ");
		
		}
	
		
	}
}