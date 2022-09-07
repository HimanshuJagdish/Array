class Solution {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        int mid = end / 2;
        int loc = -1;
        int locr,locl;

        int left = -1, right = -1;
        int[] ans = { -1, -1 };
        if (len == 0)
            return ans;
        loc = searchTarget(nums,start,end,target);
        if(loc == -1)
            return ans;
        locr = loc;
        locl = loc;
            while(right==-1){
                if((locr<(len-1)&&nums[locr+1]!=target)||locr==(len-1)){
                right = locr;
                    break;
                }else{
                    locr = searchTarget(nums,locr+1,end,target);
                }
            }
        while(left==-1){
                if((locl>0&&nums[locl-1]!=target)||locl==0){
                left = locl;
                    break;
                }else{
                    locl = searchTarget(nums,start,locl-1,target);
                }
            }
        ans[0]=left;
        ans[1]=right;
      return ans;
        
    }
    
    public int searchTarget(int[] arr,int first,int last, int key){
       
            int mid = (first + last)/2;  
            while( first <= last ){  
                if ( arr[mid] < key ){  
                    first = mid + 1;     
                }else if ( arr[mid] == key ){  
                    return mid;
                      
                }else{  
                    last = mid - 1;  
                }  
                mid = (first + last)/2;  
   
                  }
            return -1;
    }
}
