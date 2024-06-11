class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        // while (n % 2 == 0) {
        //     n /= 2;
        // }
        // while (n % 3 == 0) {
        //     n /= 3;
        // }
        // while (n % 5 == 0) {
        //     n /= 5;
        // }
        //Othe MEthod is to make a list and use Enhanced for loop
        int[] factors = {2, 3, 5};

        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        if(n==1){
         return true; }
    else{
        return false;
    }
}
}