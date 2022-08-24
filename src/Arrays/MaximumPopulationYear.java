package Arrays;

public class MaximumPopulationYear {
    public int maximumPopulation(int[][] logs) {
        int ans = 0;
        int[] pop = new int[101];
        int maxPop = 0;

        for(int[] log : logs){
            for(int i=log[0];i<log[1];i++){
                pop[i-1950]++;
            }
        }

        for(int i=0;i<pop.length;i++){
            if(pop[i]>maxPop){
                maxPop = pop[i];
                ans = i+1950;
            }
        }

        return ans;
    }
}
