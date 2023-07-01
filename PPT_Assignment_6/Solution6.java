/*

Q6.An integer array original is transformed into a **doubled** array changed by appending **twice the value** of every element in original, and then randomly **shuffling** the resulting array.

Given an array changed, return original *if* changed *is a **doubled** array. If* changed *is not a **doubled** array, return an empty array. The elements in* original *may be returned in **any** order*.

**Example 1:**

**Input:** changed = [1,3,4,2,6,8]

**Output:** [1,3,4]

**Explanation:** One possible original array could be [1,3,4]:

- Twice the value of 1 is 1 * 2 = 2.
- Twice the value of 3 is 3 * 2 = 6.
- Twice the value of 4 is 4 * 2 = 8.

Other original arrays could be [4,3,1] or [3,1,4].


*/

import java.util.*;

public class Solution6 {
    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0];
        }

        Arrays.sort(changed);

        HashSet<Integer> originalSet = new HashSet<>();

        int[] original = new int[changed.length / 2];
        int index = 0;

        for (int num : changed) {
            if (originalSet.contains(num / 2) || num % 2 != 0) {
                originalSet.remove(num / 2);
                original[index++] = num / 2;
            } else {
                originalSet.add(num);
            }
        }

        if (index != original.length) {
            return new int[0];
        }

        return original;
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);

        System.out.println("Original Array: " + Arrays.toString(original));
    }
}
