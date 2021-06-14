class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        int curr=0;
        int max=0;
       for(int i=0;i<n;i++)
       {
           
           curr=curr+arr[i];
           if(curr<0)curr=0;
           max=Math.max(max,curr);
            
       }
        return max;
    }
    
}
