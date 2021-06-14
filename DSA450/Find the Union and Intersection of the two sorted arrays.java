class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
       HashSet<Integer> deplicates = new HashSet<Integer>();
       for(int i=0;i<n;i++)deplicates.add(a[i]);
       
       for(int i=0;i<m;i++)deplicates.add(b[i]);
       return deplicates.size();
    }
}
