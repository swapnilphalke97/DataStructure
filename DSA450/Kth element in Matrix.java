class Solution
{
	public static int kthSmallest(int[][]mat,int n,int k)
	{
        int a[]=new int[n*n];
        int count=0;
        for(int i=0;i<n*n;i++)
       {
             a[count]=mat[(int)i/n][i%n];
              count++;
           
       }
       Arrays.sort(a);
       return a[k-1];
    }
}
