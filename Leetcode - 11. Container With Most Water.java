class Solution {
    public int maxArea(int[] height) {
        int left = 0 ; 
        int right = height.length-1;
        int maxArea = 0; 

        while(right>left){
            int width = right-left;
            int minHeight = Math.min(height[left], height[right]);
            int currArea = width*minHeight;
            maxArea = Math.max(currArea, maxArea);
        
            if(height[left]< height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}