class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ans=0;
        for(int i=0;i<matrix.length-1;i++)
        {
            if(target>=matrix[i][0] && target<matrix[i+1][0])
            {
                for(int j=0;j<matrix[0].length;j++)
                {
                    if(matrix[i][j]==target)ans++;
                }
            }
        }
        if(ans==0)
            for(int j=0;j<matrix[0].length;j++)
                {
                    if(matrix[matrix.length-1][j]==target)ans++;
            }
        if(ans>0)return true;else return false;
        
    }
}
