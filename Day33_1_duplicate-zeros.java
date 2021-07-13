class Solution {
    public void duplicateZeros(int[] arr) {
       
      for (int i=0;i<arr.length-1;i++) {
        if (arr[i]==0) { 
          rightShift(arr, i+1);
          i++;
        }
      }
      
    }
  
    public void rightShift(int[] arr, int index) {
      
      for (int i=arr.length-1;i>index;i--) {
        arr[i] = arr[i-1];
      } 
      arr[index]=0;
      
      
      
    }
}
