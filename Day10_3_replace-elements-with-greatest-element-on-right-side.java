class Solution {
    public int[] replaceElements(int[] arr) {
      
      int max=-1;
      
      int result[]=new int[arr.length];
      for(int i=arr.length-1;i>=0;i--) {
        result[i]=max;
        
        if(arr[i]>max) {
          max = arr[i];
        }
        
      }
      
      return result;
        
    }
}
