/*
Q8.Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

*Return the array in the form* [x1,y1,x2,y2,...,xn,yn].

**Example 1:**

**Input:** nums = [2,5,1,3,4,7], n = 3

**Output:** [2,3,5,4,1,7]
*/

import java.util.*;

class Solution8{
    public static int[] x_yArray(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[n + i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        
        int[] x_yARray = x_yArray(nums, n);
        System.out.println("Shuffled array: " + Arrays.toString(x_yARray));
    }
}
