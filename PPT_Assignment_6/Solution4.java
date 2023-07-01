/*

Q4.Given a binary array nums, return *the maximum length of a contiguous subarray with an equal number of* 0 *and* 1.

**Example 1:**

**Input:** nums = [0,1]

**Output:** 2

**Explanation:**

[0, 1] is the longest contiguous subarray with an equal number of 0 and 1.

*/
import java.util.*;

public class Solution4 {
    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1); 
        int maxLen = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] == 1) ? 1 : -1;

            if (countMap.containsKey(count)) {
                
                maxLen = Math.max(maxLen, i - countMap.get(count));
            } else {
                
                countMap.put(count, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1, 1, 0, 0};
        int maxLength = findMaxLength(nums);
        System.out.println("Maximum length of contiguous subarray: " + maxLength);
    }
}
