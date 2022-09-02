class Solution {
    public int largestAltitude(int[] gain) {
        int i,max=0,current=0;
        int n= gain.length;
        for(i=0;i<n;i++){
            current+=gain[i];
            if(current>max)
                max=current;
        }
        return max;
    }
}
