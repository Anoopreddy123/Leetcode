class Solution {
    public int[] rearrangeArray(int[] a) {
        int len = a.length;
        int[] positive  = new int[len/2];
        int ic = 0;
        int jc = 0;
        boolean count = false;
        int[] negative = new int[len/2];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=0){
                positive[ic++] = a[i];
                if(i == 0)
                 count = true;
            }else{
                negative[jc++] = a[i];
            }
        }
         ic = 0;
         jc = 0;
        for (int i = 0; i < a.length; i++) {
            
            if(i % 2 == 0){
                a[i] = positive[ic++];
            }else{
                a[i] = negative[jc++];
            }

        }

        return a;


    }
}