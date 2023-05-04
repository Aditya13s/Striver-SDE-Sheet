class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        // Brute Force
        // int [] ans = new int[2];
        // for(int i=0; i<n-1; i++) {
        //     for(int j=i+1; j<n; j++) {
        //         if(nums[i] + nums[j] == target) {
        //             ans[0] = i;
        //             ans[1] = j;
        //         }
        //     }
        // }

        // return ans;

        // Optimal (Hashing Two way)
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<n; i++) {
        //     map.put(nums[i], i);
        // }

        // for(int i=0; i<nums.length; i++) {
        //     int complement = target - nums[i];
        //     if(map.containsKey(complement) && map.get(complement) != i) {
        //         return new int[] {i, map.get(complement)};
        //     }
        // }
        // return null;

        // Optimal (Hashing One Way)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
