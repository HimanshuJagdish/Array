class Solution {
    public int diagonalSum(int[][] mat) {
        int i,k,n=mat.length,sum=0;
        for(i=0,k=n-1;i<n;i++,k--){
            sum+=mat[i][i]+mat[k][i];
        }
        if(n%2==1)
            sum-=mat[n/2][n/2];
        return sum;
    }
}
