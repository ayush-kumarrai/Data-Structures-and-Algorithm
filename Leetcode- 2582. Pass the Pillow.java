public class Solution {
  public int passThePillow(int n, int time) {
    int cycles = time / (n - 1);
    int ans=0; 
    if(cycles%2==0){
        ans= (1+time%(n-1));
    }
    else{
        ans= (n-time%(n-1));
    }

    return ans;
  }
}
