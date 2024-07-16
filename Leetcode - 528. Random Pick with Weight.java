class Solution {
    private int[] prefixSums;
    private int totalSum;
    private Random random;

    public Solution(int[] w) {
        prefixSums = new int[w.length];
        totalSum = 0;
        for (int i = 0; i < w.length; i++) {
            totalSum += w[i];
            prefixSums[i] = totalSum;
        }
        random = new Random();
    }

    public int pickIndex() {
        int target = random.nextInt(totalSum);
        int low = 0, high = prefixSums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (target < prefixSums[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

}
