class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      
        if (m==0&&n>0) {
            for(int i=0;i<n;i++) {
                nums1[i]=nums2[i];
            }
            return;
        }

        int k = nums1.length-1;
        m--;
        n--;
        while(m>=0&&n>=0) {

            if (nums1[m]>nums2[n]) {
                nums1[k]=nums1[m];
                m--;
            } else {
                nums1[k] = nums2[n];
                n--;
            }
            k--;
        }

         while(n>=0) {
            nums1[k] = nums2[n];
            k--;
            n--;

        }

        while(m>=0) {
            nums1[k] = nums1[m];
            k--;
            m--;
        }
            
        
    }
}
