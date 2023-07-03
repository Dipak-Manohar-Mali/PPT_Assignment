/*

Q6.Given two strings s and goal, return true *if and only if* s *can become* goal *after some number of **shifts** on* s.

A **shift** on s consists of moving the leftmost character of s to the rightmost position.

- For example, if s = "abcde", then it will be "bcdea" after one shift.

**Example 1:**

**Input:** s = "abcde", goal = "cdeab"

**Output:**

true

*/

class Solution6{
    public static boolean rotateString(String s, String goal) {
        char c[]=s.toCharArray();
        int t=0;
        while(t<s.length()){

        
        for(int i=0;i<s.length()-1;i++)
        {
            char temp=c[i];
            c[i]=c[i+1];
            c[i+1]=temp;
        }
        if(String.valueOf(c).equals(goal))
        {
            return true;
        }
        t++;
        }
        return false;
    }
    public static void main(String ar[])
    {
        String s="abcde";
        String g="cdeab";
        System.out.println(rotateString(s,g));
    }
}