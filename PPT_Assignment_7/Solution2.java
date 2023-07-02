/*

Q2.Given a string num which represents an integer, return true *if* num *is a **strobogrammatic number***.

A **strobogrammatic number** is a number that looks the same when rotated 180 degrees (looked at upside down).

**Example 1:**

**Input:** num = "69"

**Output:**

true

*/
class Solution2 {
    
    public static boolean isStrobogrammaticNumber(String num) {
        int left = 0;
        int right = num.length() - 1;
        
        while (left <= right) {
            char leftChar = num.charAt(left);
            char rightChar = num.charAt(right);
            
            if (leftChar == '6' && rightChar == '9' || leftChar == '9' && rightChar == '6') {
                left++;
                right--;
            } else if (leftChar == '0' && rightChar == '0') {
                left++;
                right--;
            } else if (leftChar == '1' && rightChar == '1') {
                left++;
                right--;
            } else if (leftChar == '8' && rightChar == '8') {
                left++;
                right--;
            } else {
                return false;
            }
        }
        
        return true;
    }
     public static void main(String[] args) {
        String num = "69";
        boolean isStrobogrammatic = isStrobogrammaticNumber(num);
        System.out.println(isStrobogrammatic);
    }
}
