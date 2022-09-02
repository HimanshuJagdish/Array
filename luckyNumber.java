class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m=matrix.length,n=matrix[0].length,i,j,k;
        List<Integer> lucky = new ArrayList<Integer>();
        int[] ar=new int[m*n];
        int index,min;
        int luckyCol[]=new int[n];
        boolean test;
        for(i=0;i<m;i++){
            test=true;
            min=matrix[i][0];
            index=0;
            for(j=1;j<n;j++){
                if(min>matrix[i][j])
                {
                    min=matrix[i][j];
                    index=j;
                }
            }
            if(luckyCol[index]==0){
            for(k=0;k<m;k++){
                if(matrix[i][index]<matrix[k][index]){
                    test=false;
                    break;
                }
            }
            if(test){
                
                lucky.add(min);
                luckyCol[index]=1;
            }
            }
        }
        return lucky;
    }
}
