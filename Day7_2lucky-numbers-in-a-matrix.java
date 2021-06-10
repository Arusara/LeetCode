class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
      
      Set<Integer> set = new HashSet<>();
      for (int i=0;i<matrix.length;i++) {
        int min = Integer.MAX_VALUE;
        for (int j=0;j<matrix[0].length;j++) {
          if (matrix[i][j]<min) {
            min = matrix[i][j];
          }
        }
        
        if (min!=Integer.MAX_VALUE) {
          set.add(min);
        }
      }
      
      List<Integer> result = new ArrayList<>();
      for (int i=0;i<matrix[0].length;i++) {
        int max = Integer.MIN_VALUE;
        for (int j=0;j<matrix.length;j++) {
          if (matrix[j][i]>max) {
            max = matrix[j][i];
          }
        }
        
        if (max!=Integer.MIN_VALUE && set.contains(max)) {
          result.add(max);
        }
      }
      return result;
    }
}
