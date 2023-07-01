/*

Q3.Given an array of integers arr, return *true if and only if it is a valid mountain array*.

Recall that arr is a mountain array if and only if:

- arr.length >= 3
- There exists some i with 0 < i < arr.length - 1 such that:
    - arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
    - arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

*/

class Solution3{
    public static boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;

        int i=0;
        for(;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                i++;
                break;
            }else if(arr[i]==arr[i+1])
            {
                return false;
            }
        }

        if(i<2) return false;
        for(;i<arr.length;i++)
        {
            if(arr[i-1]<=arr[i])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String ar[])
    {
        int arr[]={0,2,3,4,5,2,1,0};
        System.out.println(validMountainArray(arr));
    }
}