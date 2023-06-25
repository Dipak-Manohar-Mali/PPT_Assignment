/*

Q2.Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor. 

The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice. 

Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.

Example 1:
Input: candyType = [1,1,2,2,3,3]
Output: 3

Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.

*/

//time and space Complexity is O(n^2) and O(1) Respectively.
class Solution2{
    public static int distributeCandies(int[] candyType) {
        int uniqueCandies=0;
        for(int i=0;i<candyType.length;i++)
        {
            boolean isUnique=true;
            for(int j=0;j<i;j++)
            {
                if(candyType[i]==candyType[j]){
                isUnique=false;
                break;
                }
            }
            if(isUnique)
            uniqueCandies++;
        }
        return Math.min(uniqueCandies,candyType.length/2);
    }
    public static void main(String arg[])
   {
 	int candyType[]={1,1,2,2,3,3};
	System.out.println("Alice can only eat "+distributeCandies(candyType)+" candies.");
    
   }
}