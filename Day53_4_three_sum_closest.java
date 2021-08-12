class Solution {
    public int threeSumClosest(int[] nums, int target) {
     
        Arrays.sort(nums);

        int closestTarget=1001;

        for(int i=0;i<nums.length-2;i++) {

            int j=i+1;
            int k=nums.length-1;

            while(j<k) {

                int threeSum = nums[i]+nums[j]+nums[k];

                if (threeSum==target) {
                    return target;
                } else if (threeSum>target) {

                    if (Math.abs(target-threeSum) < Math.abs(closestTarget-target)) {
                        closestTarget=threeSum;
                    }
                    k--;
                } else {

                    if (Math.abs(target-threeSum) < Math.abs(closestTarget-target)) {
                        closestTarget=threeSum;
                    }
                    j++;
                }


            }


        }

        return closestTarget;
        
    }
}
