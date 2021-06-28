class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
       int ans[]= new int[n];
       int pointer=d;
       for(int i=0;i<n;i++)
       {
           ans[i]=arr[(d+i)%n];
       }
       for(int i=0;i<n;i++)
       {
           arr[i]=ans[i];
       }
    }
}
