
class Solution {
    int median(int matrix[][], int r, int c) {
       int size=r*c;
       int a[]=new int[size];
       int count=0;
       for(int i=0;i<r;i++)
       {
           for(int j=0;j<c;j++)
           {
              a[count]=matrix[i][j];
              count++;
           }
       }
       Arrays.sort(a);
       if(size%2 ==1 )
       {return a[(size-1)/2];}
       else
       {return (a[(size/2)-1]+a[(size/2)])/2;}
    }
}
