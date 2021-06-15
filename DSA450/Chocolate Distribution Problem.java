class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
       Collections.sort(a); 
       long min=1111111111;
       for(int i=0;i<((int)n-(int)m+1);i++)
       {
           min=Math.min(min,a.get(i+(int)m-1)-a.get(i));
       }
       return min;
    }
}
