/*


Q5.You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.

Given the integer n, return *the number of **complete rows** of the staircase you will build*.
*/




class Solution5{
    public static int arrangeCoins(int n) {
        long left = 0;
        long right = n;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long curr = mid * (mid + 1) / 2;
            
            if (curr == n) {
                return (int)mid;
            } else if (curr < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return (int)right;
    }
	public static void main(String ar[])
	{

	  System.out.println(arrangeCoins(5));
	}
}
