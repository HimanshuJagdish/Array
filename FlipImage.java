class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int j,i,k;
        int[][] ans = new int[n][n];
        
        for(i=0;i<n;i++){
            for(k=0,j=n-1;j>=0;j--,k++){
                ans[i][k]=Math.abs(image[i][j]-1);
            }
        }
        return ans;
    }
}
