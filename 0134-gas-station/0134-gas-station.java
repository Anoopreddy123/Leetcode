class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int costSum = 0, gasSum = 0;
        for(int i = 0; i < gas.length; i++){
            costSum += cost[i];
            gasSum += gas[i];
        }

        if(gasSum < costSum){
            return -1;
        }


        int total = 0, res = 0;

        for(int i =0; i < gas.length; i++){

            total += gas[i] - cost[i];
            if(total < 0){
                total = 0;
                res = i + 1;
            }


        }


        return res;
    }
}