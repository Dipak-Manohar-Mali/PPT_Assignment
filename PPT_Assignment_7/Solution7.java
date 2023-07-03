/*
Q7.Given two strings s and t, return true *if they are equal when both are typed into empty text editors*. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

**Example 1:**

**Input:** s = "ab#c", t = "ad#c"

**Output:** true

**Explanation:**

Both s and t become "ac".
*/
class Solution7{
    public static String CheckAndRemove(String s)
    {
        int count=0;
        StringBuilder str=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!='#' && count ==0)
            {
                str.append(s.charAt(i));
            }else if(s.charAt(i)=='#')
            {
                count++;
            }else if(s.charAt(i)!='#' && count >0)
            {
                count--;

            }
        }
        str.reverse();
        return str.toString();
    }
    public static boolean backspaceCompare(String s, String t) {
        String s1=CheckAndRemove(s);
        String s2=CheckAndRemove(t);
        if(s1.equals(s2))
        return true;
        else
        return false;
    }
    public static void main(String ar[])
    {
        String s = "ab#c", t = "ad#c";
        System.out.println(backspaceCompare(s,t));
    }
}