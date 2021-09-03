class Solution {
    public boolean isPerfectSquare(int num) {
      if (num<2) return true;
      int left = 2;
      int right = num/2;
      while(left<=right) {
        int mid = left + (right-left)/2;
      
        if (mid==num/mid && num%mid==0) return true;
        if (mid>num/mid) {
          right = mid-1;
        } else {
          left = mid+1;
        }
      }
      return false;
    }
}
