class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        
            int totalCost = 0, minCost = 0;

            int rowSize = rowCosts.length, colSize = colCosts.length;

            int startIndex = startPos[0], homeStart = homePos[0];

            int endIndex = startPos[1], homeEnd = homePos[1];

           if(startIndex < homeStart)
           { while(startIndex < homeStart){
                totalCost += rowCosts[++startIndex];
            }
           }else{
            while(startIndex > homeStart){
                totalCost += rowCosts[--startIndex];
            }
           } 


 if(endIndex < homeEnd)
           {  while(endIndex < homeEnd){
                totalCost += colCosts[++endIndex];

            } 
           }else{
             while(endIndex > homeEnd){
                totalCost += colCosts[--endIndex];

            } 
           } 
           

           return totalCost;

    }
}