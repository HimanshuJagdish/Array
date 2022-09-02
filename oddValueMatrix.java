class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int ans=0;
        int i,j,l=indices.length;
        int[] r=new int[m];
        int[] c=new int[n];
        int oddR=0,evenR=m*n, oddC=0, evenC=m*n;
        
        for(i=0;i<l;i++){
            r[indices[i][0]]+=1;
            if(r[indices[i][0]]%2==1){
                oddR+=1;
            }else{
                oddR--;
            }
            
            c[indices[i][1]]+=1;
            if(c[indices[i][1]]%2==1){
                oddC++;
            }else{
                oddC--;
            }
        }
        
        evenR=m-oddR;
            evenC=n-oddC;
        
            ans=oddR*evenC + oddC*evenR;
        
        
        
       
        return ans;
    }
}
