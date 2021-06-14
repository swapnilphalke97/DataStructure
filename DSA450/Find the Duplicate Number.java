class Solution {
    public int findDuplicate(int[] nums) {
        int count=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
           arr[nums[i]]=arr[nums[i]]+1;
        }
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]>1)
           {
               count=i;
           }
        }
 return count;
    }
}
