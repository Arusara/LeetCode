class Solution {
    public int findLucky(int[] arr) {
      int result[] = new int[500];
      
      for(int i=0;i<arr.length;i++) {
        result[arr[i]-1]++;
      }
      
      //System.out.println(Arrays.toString(result));
      
      for(int i=499;i>=0;i--) {
        
        if (result[i]==i+1) return i+1;
        
      }
      
      return -1;
        
    }
}
