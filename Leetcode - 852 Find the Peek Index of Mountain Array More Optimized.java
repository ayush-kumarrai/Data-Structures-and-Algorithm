class Solution {
  public int peakIndexInMountainArray(int[] arr) {
    int start = 0; 
    int end = arr.length -1;

    while (start < end ){
        int mid = start + (end - start)/2;
        if(arr[mid]> arr[mid+1]){
            // Descending side
            end = mid;
        }
        else{
            //ascending part me honge
            start = mid +1; 
        }
    }
    // start and end are always trying to find the max value in the array
    return start;
  }
}
