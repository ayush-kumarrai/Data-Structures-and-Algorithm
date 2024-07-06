class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> Lfinal = new ArrayList<>();
        int i = 0, j = 0;
        
        while(nums1.length>i && nums2.length>j){
            if(nums1[i]==nums2[j]){
                Lfinal.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        int[] finalArr = new int[Lfinal.size()];
        for (int k = 0; k < Lfinal.size(); k++) {
            finalArr[k] = Lfinal.get(k);
        }
        return finalArr;
    }
}