class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int l = nums.length - 1;
        int m = s + (l - s) / 2;

        while (l >= s) {
            int mid = s + (l - s) / 2;
            if (nums[mid] == target)
                return mid;

                if (nums[mid] > target) {
                    l = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        if (target>nums[m]) {
            return s;
        }
        else if(target<nums[0]){
            return 0;
        }
        else if(target>nums[nums.length-1]){
            return nums.length+1;
        }
        else {
            return l+1;
        }

        }

    }
