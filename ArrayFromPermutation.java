class Solution {
    public int[] buildArray(int[] nums) {
         int len=nums.length;
        int[] ans = new int[len];
        int start=0;
        int end=len-1;
        
        while(start<=end){
            ans[start]=nums[nums[start]];
            ans[end]=nums[nums[end]];
            start++;
            end--;
            
        }
        return ans;
    }
    
   
}
