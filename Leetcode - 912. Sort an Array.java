class Solution {
    public int[] sortArray(int[] arr) {
        while (circleSort(arr, 0, arr.length - 1) != 0) {
          
        }
        return arr; 
    }

    int circleSort(int[] arr, int low, int high) {
        if (low == high) {
            return 0;
        }

        int swaps = 0;
        int lo = low;
        int hi = high;

        while (lo < hi) {
            if (arr[lo] > arr[hi]) {
                swap(arr, lo, hi);
                swaps++;
            }
            lo++;
            hi--;
        }

        if (lo == hi && lo + 1 <= high && arr[lo] > arr[lo + 1]) {
            swap(arr, lo, lo + 1);
            swaps++;
        }

        int mid = (high - low) / 2;
        swaps += circleSort(arr, low, low + mid);
        swaps += circleSort(arr, low + mid + 1, high);

        return swaps;
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
