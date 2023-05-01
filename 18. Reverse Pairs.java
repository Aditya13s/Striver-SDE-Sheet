class Solution {
    public int reversePairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                long check = (long)nums[j] * 2;
                if((long)nums[i] > check) {
                    count++;
                }
            }
        }

        return count;
        
    }
}
