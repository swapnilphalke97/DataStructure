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
//proper solution
class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trappingWater(int arr[], int n) { 
       int[] l=new int[n];
int[] r=new int[n];
int temp=arr[0];
int temp1=arr[n-1];
for(int i=0;i<n;i++)
{
if(arr[i]>=temp){temp=arr[i];}l[i]=temp;}

for(int i=n-1;i>=0;i--)
{
if(arr[i]>=temp1){
temp1=arr[i];}r[i]=temp1;}
int sum=0;
for(int i=0;i<n;i++)
{
sum=sum+Math.min(l[i],r[i])-arr[i];
}
return sum;
    }  
}
