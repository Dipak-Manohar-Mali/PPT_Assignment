/*

Q1.A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

- s[i] == 'I' if perm[i] < perm[i + 1], and
- s[i] == 'D' if perm[i] > perm[i + 1].

Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return **any of them**.

**Example 1:**

**Input:** s = "IDID"

**Output:**

[0,4,1,3,2]

*/



class Solution1 {
    public static int[] diStringMatch(String s) {
        int dec=s.length();
        int inc=0;
        int n=s.length();
        int arr[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='I')
            {
                arr[i]=inc++;
            }else
            {
                arr[i]=dec--;
            }
            arr[n]=dec;

            

        }
        return arr;
    }
    public static void main(String ar[])
    {
        String s="IDID";
        int arr[]=diStringMatch(s);
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+ " ");
    }
}