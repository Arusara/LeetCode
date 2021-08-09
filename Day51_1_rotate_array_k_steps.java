class Solution {
    public void rotate(int[] arr, int k) {
        
         k=k%arr.length;
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-k-1);
        reverse(arr, 0, arr.length-1);
    }
  
     public void reverse(int arr[], int start, int end) {


        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }


    }

}
