class Solution {
    int isPlaindrome(String S) {
        int len=S.length();
        int f=0;
        int l=len-1;
        int count=0;
        for( int i=0;i<len/2;i++)
        {
            if(S.charAt(f)==S.charAt(l))
            {
                count++;
            }
            f++;
            l--;
        }
        if(count==len/2)
        {
            return 1;
        }
        else
        return 0;
    }
};
