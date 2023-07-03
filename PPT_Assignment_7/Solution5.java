/*

Q5.Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

**Example 1:**

**Input:** s = "abcdefg", k = 2

**Output:**

"bacdfeg"

*/

class Solution5 {
    public static String reverseStr(String s, int k) {
       char []c=s.toCharArray();
       for(int i=0;i<s.length();i+=2*k)
       {
           int st=i,en=Math.min(i+k-1,c.length-1);
           while(st<en)
           {
               char temp=c[st];
               c[st++]=c[en];
               c[en--]=temp;
           }
       }

       return String.valueOf(c);
    }
    public static void main(String arg[])
    {
        String s="abcdefg";
        int k=2;
        System.out.println(reverseStr(s,k));

    }
}