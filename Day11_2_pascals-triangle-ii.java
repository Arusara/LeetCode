class Solution {
    public List<Integer> getRow(int rowIndex) {
      
      List<Integer> prevlist = new ArrayList<>();
      
      for(int i=0;i<=rowIndex;i++) {
        
        List<Integer> list = new ArrayList<>();
        
        
        for(int j=0;j<=i;j++) {
          
          if(i==j || j==0) {
            list.add(1);
          } else {
            list.add(prevlist.get(j-1)+prevlist.get(j));
          }
        
        }
        prevlist=list;
        
      }
      
      return prevlist;
      
      
      
        
    }
}
