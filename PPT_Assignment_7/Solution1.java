/*

Q1.Given two strings s and t, *determine if they are isomorphic*.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

**Example 1:**

**Input:** s = "egg", t = "add"

**Output:** true

*/
import java.util.*;
class Solution1{
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            
            if(hm.containsKey(s.charAt(i)))
            {
                if(!hm.get(s.charAt(i)).equals(t.charAt(i)))
                {
                    return false;
                }
            }else
                {
                    if(hm.containsValue(t.charAt(i)))
                   {
                    return false;
                    }
                    hm.put(s.charAt(i),t.charAt(i));
            }

            
        }
        return true;
    }
    public static void main(String ar[])
    {
        String s="egg";
        String t="add";

        System.out.println(isIsomorphic(s, t));
    }
}