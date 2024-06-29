class Solution {
    public int findNthDigit(int n) {
        int start= 1;
        long len = 1; 
        int count= 9; 

        while(n>len*count){
            n-= len*count;
            len++;
            start *= 10;
            count *= 10;
        }
    start+= (n-1)/len;
    String s = Integer.toString(start);
    return Character.getNumericValue(s.charAt((int)((n-1)%len)));
    
    }
}