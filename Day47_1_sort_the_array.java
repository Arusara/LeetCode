class Solution {
    public int[] sortArray(int[] nums) {
      
       quickSort(nums, 0, nums.length-1);
       return nums;
    }
  
  
    public void quickSort(int arr[], int low, int high) {
      
      if (low<high) {
        int part = partition(arr, low, high);
        quickSort(arr, low, part-1);
        quickSort(arr, part+1, high);
      }
    }
      
      
      public int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int start = low;
        int end = high;
        
        while(start<end) {
          while(start < high && arr[start]<=pivot) {
            start++;
          } 
          
          while(end>0 && arr[end]>pivot) {
            end--;
          }
          
          if (start<end) {
            swap(arr, start,end);
          }
        }
        swap(arr, low, end);
        return end;
      }
      
      public void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
      }
      
}
