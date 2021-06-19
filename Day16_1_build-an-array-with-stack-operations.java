class Solution {
    public List<String> buildArray(int[] target, int n) {
      List<String> list = new ArrayList<>();
      int m = target.length;
      
      int i = 1;
      int j = 0;
      
      while (i<=n && j<m) {
        
        if (target[j]==i) {
          list.add("Push");
          j++;
        } else {
          list.add("Push");
          list.add("Pop");
        }
        i++;
      }
      return list;
        
    }
}
