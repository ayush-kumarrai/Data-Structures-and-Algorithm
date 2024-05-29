class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start= 0; 
        int end = letters.length-1;
        int middle = start + (end - start)/2;

        while(end>=start){
            int mid =  start + (end - start)/2;
            if(letters[mid]==target){
                return letters[mid+1];
            }
            else if(letters[mid]>target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        if(target<letters[0]){
            return letters[0];
        }
        else if(target>letters[letters.length-1]){
             return letters[0];
        }
         else if(target>letters[middle]){
            return letters[start];
        }
        else{
            return letters[end-1];
        }
    }

}