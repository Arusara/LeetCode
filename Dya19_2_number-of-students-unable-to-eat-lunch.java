class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
      
      int a[] = new int[2];
      
      for(int student:students) {
        a[student]++;
      }
      
      for (int i=0;i<sandwiches.length;i++) {
        
        
        if (a[sandwiches[i]]==0) {
          return sandwiches.length-i;
        } else {
          a[sandwiches[i]]--;
        }
      }
      
      return 0;
        
    }
}
