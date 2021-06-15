

class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
       int a[]=new int[N*N];
       int count=0;
       int arr[][]=new int[N][N];
       for(int i=0;i<N*N;i++)
       {
             a[count]=Mat[(int)i/N][i%N];
              count++;
           
       }
       Arrays.sort(a);
        for(int i=0;i<(N*N);i++)
       {
           
              arr[(int)(i/N)][i%N]=a[i];
        }
       return arr;
    }
};

//Actual
