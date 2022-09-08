class Solution {
    public int maximumPopulation(int[][] logs) {
        int n=logs.length,i;
        int[] population = new int[2051];
        for( i=0;i<n;i++){
            for(int j=logs[i][0];j<logs[i][1];j++){
                population[j]+=1;
            }
        }
        int max=0,index=1950;
        for(i=1950;i<2051;i++){
            if(max<population[i]){
                max=population[i];
                index=i;
            }
        }
        return index;
    }
}
