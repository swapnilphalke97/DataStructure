class Solution
{
    public static void sort012(int a[], int n)
    {
        int zero=0;
        int one=0;
        int two=0;
       for(int i=0;i<n;i++)
       {
           if(a[i]==0) zero++;if(a[i]==1) one++;if(a[i]==2) two++;
        }
        for(int i=0;i<=zero-1;i++){a[i]=0;}
        for(int i=zero;i<=zero+one-1;i++){a[i]=1;}
        for(int i=one+zero;i<=zero+two+one-1;i++){a[i]=2;}
        
        
    }
}
