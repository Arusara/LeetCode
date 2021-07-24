class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
      
      int arrayMap[] = new int[1001];
      
      int result[] = new int[arr1.length];
       
      for (int i=0;i<arr1.length;i++) {
        arrayMap[arr1[i]]++;
      }
      
      int pointer = 0;
      for (int i=0;i<arr2.length;i++) {
        while(arrayMap[arr2[i]]>0) {
          result[pointer++] = arr2[i];
          arrayMap[arr2[i]]--;
        }
      }
      
      for (int i=0;i<arrayMap.length;i++) {
        while (arrayMap[i]>0) {
          result[pointer++] = i;
          arrayMap[i]--;
        }
        
      }
      return result;
    }
}
