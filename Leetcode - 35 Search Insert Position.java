class Solution {
    public int searchInsert(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        int middle= start + (end-start)/2;

        while(end>=start){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
                
            }
            else
            {
                 start = mid+1;
            }
        }
        if(target < nums[0]){
            return 0;
        }
        else if(target>nums[middle]){
            return start;
        }
        else if(target<nums[middle]){
            return end +1;
        }
        else{
            return nums.length;
        }
    }
}