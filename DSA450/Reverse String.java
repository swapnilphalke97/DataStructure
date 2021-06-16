class Solution {
    public void reverseString(char[] s) {
  
        int len=s.length;
        int f=0;
        int l=len-1;
        char temp;
        for(int i=0;i<(len)/2;i++)
        {
            temp=s[f];
            s[f]=s[l];
            s[l]=temp;
            f++;
            l--;
        }
    }
}
