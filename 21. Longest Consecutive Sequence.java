class Solution {
    public int longestConsecutive(int[] nums) {

        // Brute Force
        /*  if(nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);

        int ans = 1;
        int curr = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1] + 1) {
                curr++;
            } else if (nums[i] != nums[i-1]) {
                curr = 1;
            }
            ans = Math.max(ans, curr);
        }

        return ans; */


        // Optimal Approach
        Set<Integer> set = new HashSet<>();
        for(int num: nums) {
            set.add(num);
        }

        int longestCount = 0;

        for(int num: nums) {
            if(!set.contains(num-1)) {
                int currNum = num;
                int currCount = 1;
                while(set.contains(currNum+1)) {
                    currNum++;
                    currCount++;
                }

                longestCount = Math.max(longestCount, currCount);
            }
        }

        return longestCount;
        
    }
}
