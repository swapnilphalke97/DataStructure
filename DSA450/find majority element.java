
class Solution
{
    static int majorityElement(int a[], int size)
    {
        int ai=0;
        int count=1;
        int max=0;
        int ans=0;
      Arrays.sort(a);
      for(int i=1;i<size;i++)
      {
          if(a[i]==a[i-1])
          {
              ai=a[i];
              count++;
              
              
          }
          else
          {
              if(count>=max)
               {
                   max=count;
                  
                   ans=ai;
                    count=1;
               }
             
           
          }
      }
      if(count>=max)
               {
                   max=count;
                   
                   ans=ai;
                   
               }
               if(size==1)return a[0]; else
               {
      if(max>(size/2))return ans; else return -1;}
    }
}
