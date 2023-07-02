/*

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

**Example 1:**

**Input:** s = "Let's take LeetCode contest"

**Output:** "s'teL ekat edoCteeL tsetnoc"

*/
class Solution4 {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            sb.append(reversedWord.reverse()).append(" ");
        }
        
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String reversed = reverseWords(s);
        System.out.println(reversed);
    }
    
}
