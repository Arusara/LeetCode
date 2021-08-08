class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
      Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
        for(int x: arr)
            m.put(x, 1);

        int first = 1;
        for(Integer x: m.keySet()){
            m.put(x, first);
            first++;
        }

        for(int i=0;i<arr.length;i++) {
            arr[i] = m.get(arr[i]);
        }
      
      return arr;
      
    }
}
