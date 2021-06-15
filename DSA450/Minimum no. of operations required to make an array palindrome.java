class GfG
{
	public static int palinArray(int[] a, int n)
           { int count=0;
                 for(int i=0;i<n;i++)
                 {
                     String check=Integer.toString(a[i]);
                     for(int j=0;j<(int)(check.length()/2);j++)
                     {
                         if(check.charAt(j)!=check.charAt(check.length()-1-j))
                         {count++;}
                     }
                 }
                 if(count>0)return 0;
                 else return 1;
           }
}
