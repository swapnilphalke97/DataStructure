class Solution
{
    public int find_fact(int[] v)
    {
        Arrays.sort(v);
        int ans=0;
        if(v.length%2==0)
        {
            ans=(int)((v[v.length/2]+v[(v.length/2)-1])/2);
        }
        else
        {
            ans=v[(int)((v.length-1)/2)];
        }
        return ans;
    }
}
