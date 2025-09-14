class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int robStart = startPos[0], robEnd = startPos[1];
        int houseStart = homePos[0], houseEnd = homePos[1];

        int totalCost = 0;

        if(robStart < houseStart){
            while(robStart < houseStart){
                robStart++;
                totalCost += rowCosts[robStart];
            }
        }else{
            while(robStart > houseStart){
                robStart--;
                totalCost += rowCosts[robStart];
            }
        }


        if(robEnd < houseEnd){
            while(robEnd < houseEnd){
                robEnd++;
                totalCost += colCosts[robEnd];
            }
        }else{
            while(robEnd > houseEnd){
                robEnd--;
                totalCost += colCosts[robEnd];
            }
        }

        return totalCost;
    }
}