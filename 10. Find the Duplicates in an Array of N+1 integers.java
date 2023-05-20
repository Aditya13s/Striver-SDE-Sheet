class Solution {
    public int findDuplicate(int[] nums) {

        // Brute Force Approach
        // Arrays.sort(nums);
        // for(int i=1; i<nums.length; i++) {
        //     if(nums[i] == nums[i-1]) {
        //         return nums[i];
        //     }
        // }
        // return -1;

        // Using Sets
        // Set<Integer> set = new HashSet<>();
        // for(int num: nums) {
        //     if(set.contains(num)) {
        //         return num;
        //     }
        //     set.add(num);
        // }
        // return -1;

        // Using Slow & Fast Pointers
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow!= fast);

        fast = nums[0];
        while(slow!= fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
