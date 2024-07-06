class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missingCount=0;
        int currentNum =1; 
        int index=0; 

        while(missingCount<k){
            if(index<arr.length && arr[index]==currentNum){
                index++;
            }
            else{
                missingCount++;
            }
            if(missingCount<k){
                currentNum++;
            }
        }
        return currentNum;
    }
}