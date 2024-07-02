class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] finalArr = new int[10];
        int index=0;
        for(int i=0;i<nums1.length-1; i++){
            for(int j=0; j<nums2.length-1; j++){
                if(nums1[i]==nums2[j]){
                    finalArr[index]=nums1[i];
                    index++;
                    break;
                }
            }

        }
        return finalArr;
    }
}