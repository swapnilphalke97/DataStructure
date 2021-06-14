class Solution {

    public static long sb(long a[], long n, long x) {
       long sum=0;
       long min=25555;
       long count=0;
       for(int i=0;i<n;i++)
       {
           for(int j=(int)i;j<n;j++)
           {
           sum=sum+a[j];
           count++;
           if(sum>x)
           {sum=0;
           min=Math.min(count,min);
               count=0;
               break;
           }
           
           }
           sum=0;
           count=0;
           
       }
       return min;
    }
}
