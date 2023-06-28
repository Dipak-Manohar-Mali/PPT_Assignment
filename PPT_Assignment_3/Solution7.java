/*



Q7.You are given an inclusive range [lower, upper] and a sorted unique integer array
nums, where all elements are within the inclusive range.

A number x is considered missing if x is in the range [lower, upper] and x is not in
nums.

Return the shortest sorted list of ranges that exactly covers all the missing
numbers. That is, no element of nums is included in any of the ranges, and each
missing number is covered by one of the ranges.


*/




import java.util.*;

public class Solution7 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        int start = lower;

        for (int num : nums) {
            if (num <= start) {
                continue;
            }

            if (num == start + 1) {
                start++;
            } else {
                result.add(getRange(start + 1, num - 1));
                start = num;
            }
        }

        if (start < upper) {
            result.add(getRange(start + 1, upper));
        }

        return result;
    }

    private String getRange(int start, int end) {
        return start == end ? String.valueOf(start) : start + "->" + end;
    }

    public static void main(String[] args) {
        Solution7 finder = new Solution7();

        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;

        List<String> missingRanges = finder.findMissingRanges(nums, lower, upper);

        System.out.println("Missing Ranges: " + missingRanges);
    }
}
