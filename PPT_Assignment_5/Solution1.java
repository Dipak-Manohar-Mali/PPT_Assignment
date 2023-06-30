/*

Convert 1D Array Into 2D Array

Q1.You are given a **0-indexed** 1-dimensional (1D) integer array original, and two integers, m and n. You are tasked with creating a 2-dimensional (2D) array with  m rows and n columns using **all** the elements from original.

The elements from indices 0 to n - 1 (**inclusive**) of original should form the first row of the constructed 2D array, the elements from indices n to 2 * n - 1 (**inclusive**) should form the second row of the constructed 2D array, and so on.

Return *an* m x n *2D array constructed according to the above procedure, or an empty 2D array if it is impossible*.

**Input:** original = [1,2,3,4], m = 2, n = 2

**Output:** [[1,2],[3,4]]

*/



class Solution1{
    public static int[][] construct2DArray(int[] original, int m, int n) {
       int arr[][]=new int[m][n];
       if(m*n !=original.length)
       {
           return new int[0][0];
       }
       for(int i=0;i<m;i++)
       {
           for(int j=0;j<n;j++)
           {
               arr[i][j]=original[i*n+j];
            
           }
       } 
       return arr;
    }
public static void main(String ar[])
{

     int []original={1,2,3,4};	//m=row,n=col
     int arr[][]=construct2DArray(original,2,2);
     for(int i=0;i<arr.length;i++){
	for(int j=0;j<arr[0].length;j++)
	{
	  System.out.print(arr[i][j]+ " ");	
	}
         System.out.println();
	}
}
}