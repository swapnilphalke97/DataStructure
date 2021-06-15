//Naive
class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trappingWater(int arr[], int n) { 
        int sum=0;
       for(int i=1;i<n-1;i++)
       {
           
            int getmin=0;
        for(int j=0;j<i;j++)
       {
            getmin=Math.max(getmin,arr[j]);
           
       }
        int getmax=0;
        for(int k=i+1;k<n;k++)
       {
         getmax=Math.max(getmax,arr[k]);
           
       }
       if(arr[i]<Math.min(getmin,getmax)){
        sum=sum+Math.min(getmin,getmax)-arr[i];}
       }
       return sum;
        
    }  
}
