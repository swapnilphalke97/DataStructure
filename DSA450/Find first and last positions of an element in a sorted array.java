
    ArrayList<Long> find(long arr[], int n, int x)
    {
        int first=-1;
        int last=0;
        int count=0;
         ArrayList<Long> ans=new  ArrayList<Long>();
         for(int i=0;i<n;i++)
         {
             if(arr[i]==(long)x){ if(count==0){first=i;} count++;}
         }
         if(first==-1)last=-1; else {last=first+count-1;}
         ans.add((long)first);ans.add((long)last);
         return ans;
    }

