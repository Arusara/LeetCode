class Solution {
    public int findKthPositive(int[] arr, int k) {
      
       
        int count = 0;
        int i = 1;
        int j = 0;

        Set<Integer> set = new HashSet<>();

        for (int z=0;z<arr.length;z++) {
           set.add(arr[z]);
        }
        while (true) {

            if (!set.contains(i)) {
                count++;
            }
            if (count==k) {
                return i;
            }
            i++;
        }
        
    }
}
