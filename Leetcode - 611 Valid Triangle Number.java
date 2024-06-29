class Solution {
    public int triangleNumber(int[] nums) {
        if(nums.length<3 || nums==null) return 0;

        Arrays.sort(nums);
        int count = 0 ; 
        for(int k = nums.length -1; k>=2;k--){
            int i =0; 
            int j= k-1;

            while(j>i){
                if(nums[i]+ nums[j] >nums[k]){
                    count+= j-i;
                    j--;
                }
                else{
                    i++;
                }
            }
        }
        return count;
    }
}