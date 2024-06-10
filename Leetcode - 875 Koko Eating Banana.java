import static java.lang.Math.ceil;
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       
        int start = 1;
        int end = findMaxPile(piles);

        while(start<end){
            int mid = start + (end-start)/2;
            int hour = calc(piles, mid);
            if(hour <= h){
                end= mid;
            }
            else{
                start= mid+1;
            }

        }
        return start;
        }
        
    int findMaxPile(int[] piles) {
        int maxPile = piles[0];
        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }
        return maxPile;
    }


    int calc(int[] piles, int k) {
        int totalhrs = 0;
        for (int pile : piles) {
            totalhrs += Math.ceil((double) pile / k);
        }
        return totalhrs;
    }
}