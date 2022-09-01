class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2*n];
        int i=0;
        int j= 2*n -1;
        for(;i<n&&j>=n;j--,i++){
            ans[2*i]=nums[i];
            ans[j-i]=nums[j];
        }
        return ans;
    }
}
