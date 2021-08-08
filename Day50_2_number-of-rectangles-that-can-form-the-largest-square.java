class Solution {
    public int countGoodRectangles(int[][] rectangles) {
      
      int square[] = new int[rectangles.length];
      
      int index=0;
      int max=1;
      for(int arr[]:rectangles) {
        square[index] = Math.min(arr[0], arr[1]);
        max = Math.max(max, square[index]);
        index++;
      }
      
      int count=0;
      for(int i=0;i<square.length;i++) {
        
        if (square[i]==max) count++;
        
      }
      
      
     // System.out.println(Arrays.toString(square));
        
      
      return count;
      
        
    }
}
