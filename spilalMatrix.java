class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int i,j,k,l,p,q;
        List<Integer> spiral = new ArrayList<Integer>();
        i=0;j=0;k=m-1;l=n-1;
        int count = 0;
        while(count<m*n){
            
            for(p=i,q=j;q<=l;q++)
            {
                spiral.add(matrix[p][q]);
                count++;
            
            }
            if(count<m*n)
            for(p=i+1,q=l;p<=k;p++)
            {
                spiral.add(matrix[p][q]);
                count++;
            
            }
            if(count<m*n)
            for(p=k,q=l-1;q>=j;q--){
                spiral.add(matrix[p][q]);
                count++;
            
            }   
            if(count<m*n)
            for(p=k-1,q=j;p>i;p--)
            {
                spiral.add(matrix[p][q]);
                count++;
            
            }
            i+=1;j+=1;k-=1;l-=1;
            
        }
        return spiral;
    }
}
