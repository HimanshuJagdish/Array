class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int colorCount[]={0,0,0};
        int i,j=len-1,k=0,temp;
        
        for(i=0;i<j&&k<j&&j>k;i++){
            if(nums[i]==2){
                temp=nums[j];
                nums[j]=2;
                nums[i]=temp;
                j--;
            }
            else if(nums[i]==0){
                temp=nums[k];
                nums[k]=0;
                nums[i]=temp;
                k++;
            }
        }

    }
}
