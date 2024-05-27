class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int l = nums.length - 1;

        boolean isAsc = nums[s] < nums[l];

        while (l >= s) {
            int mid = s + (l - s) / 2; 
            if (nums[mid] == target)
                return mid;

            if (isAsc) {
                if (nums[mid] > target) {
                    l = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                if (nums[mid] < target) {
                    l = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return -1;

    }
}