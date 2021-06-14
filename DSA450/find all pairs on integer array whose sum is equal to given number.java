class Solution {
    int getPairsCount(int[] arr, int n, int k) {
       Arrays.sort(arr);
       int count=0;
       int sum=0;
       
       for(int i=0;i<(n-1);i++)
       {
           if(arr[i]<=k)
           {
           
           for(int j=i+1;j<(n);j++)
           {
           sum=arr[i]+arr[j];
           if(k==sum)
           {
               count++;
               
           }
           if(k<sum)
           {
               break;
           }
           }
           
           }
           
       
    }
      return count;  
        
    }
    
    
}
