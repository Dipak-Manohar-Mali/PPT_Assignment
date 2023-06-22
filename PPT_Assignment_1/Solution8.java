/*
💡 Q8. You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

*/


import java.util.*;

public class Solution8 {
    public static int[] findError(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int dup = 0;
        int missing = 0;

        for (int num : nums) {
            if (set.contains(num)) {
                dup = num;
            }
            set.add(num);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                missing = i;
            }
        }

        return new int[]{dup, missing};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = findError(nums);
        System.out.print("Output: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
