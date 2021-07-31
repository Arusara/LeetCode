class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
      
      int result[] = new int[n];
      
      for(int[] booking:bookings) {
        
       int a = booking[0];
       int b = booking[1];
       int c = booking[2];
        
       for(int i=a-1;i<=b-1;i++) {
         
         result[i]+=c;
       }

      }
      return result;
        
    }
}
