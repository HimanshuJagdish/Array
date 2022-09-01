class Solution {
    public int minCostToMoveChips(int[] position) {
        int len = position.length;
        if(len==1)
            return 0;
        int odd=0,even=0;
        for(int i=0;i<len;i++){
            if(((position[i]>>0) & 1)==1)
                odd++;
            else
                even++;
            
        }
        if(even>odd)
            return odd;
        else
            return even;
    }
}
