/*

Q2.You are given an m x n integer matrix matrix with the following two properties:

- Each row is sorted in non-decreasing order.
- The first integer of each row is greater than the last integer of the previous row.

Given an integer target, return true *if* target *is in* matrix *or* false *otherwise*.

You must write a solution in O(log(m * n)) time complexity.

*/


class Solution2{
    public static boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int n=matrix.length;
        int m=matrix[0].length;
        int high=m*n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(matrix[mid/m][mid%m]==target)
            {
                return true;
            }else if(matrix[mid/m][mid%m]>target)
            {
                high=mid-1;
            }else
            {
                low=mid+1;
            }
        }
        return false;
    }
    public static void main(String ar[])
    {
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        System.out.println(searchMatrix(arr, target));
    }
}