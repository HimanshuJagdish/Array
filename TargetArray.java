class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targer = new ArrayList<Integer>(nums.length);
        int n=nums.length,i;
        for(i=0;i<n;i++){
            targer.add(index[i],nums[i]);
        }
        int ans[]=new int[n];
        for(i=0;i<n;i++){
            ans[i]=targer.get(i);
        }
        return ans;
    }
}
