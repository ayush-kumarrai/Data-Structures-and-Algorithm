class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigit =0;
        int doubleDigit =0;
        for(int numbers: nums){
            if(numbers>9){
                doubleDigit+=numbers;
            }
            else{
                singleDigit+=numbers;
            }
        }
        if(singleDigit == doubleDigit){
            return false;
        }
        return true;
    }
}