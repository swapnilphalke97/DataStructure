class Solution {
    static int countSquares(int N) {
        int out=0;
        int count=0;
        for(int i=1;i<N;i++)
        {
            out=i*i;
            if(out<N)
            {
                count++;
                
            }
            else
            {
                break;
            }
        } return count;
    }
   
}
