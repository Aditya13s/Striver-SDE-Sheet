class Solution {
    public int majorityElement(int[] nums) {
        // Brute Force
        // for(int i=0; i<nums.length; i++) {
        //     int count = 0;
        //     for(int j=0; j<nums.length; j++) {
        //         if(nums[i] == nums[j]) {
        //             count++;
        //         }
        //     }
        //     if(count > nums.length/2) {
        //         return nums[i];
        //     }
        // }
        // return -1;


        // Optimal Approach
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int num: nums) {
        //     if(!map.containsKey(num)) {
        //         map.put(num,1);
        //     } else {
        //         map.put(num, map.get(num)+1);
        //     }
        // }
        // int max=0;

        // for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
        //     if(max == 0 && entry.getValue() > nums.length/2) {
        //         max = entry.getKey();
        //         break;
        //     }
        // }

        // return max;

        // //Optimal
        // Arrays.sort(nums);
        // return nums[nums.length/2];

        //Most Optimal
        int cnt = 0;
        int el = 0;

        for(int i=0; i<nums.length; i++) {
            if(cnt == 0) {
                cnt++;
                el = nums[i];
            } else if(nums[i] == el) {
                cnt++;
            } else {
                cnt--;
            }
        }

        return cnt;
    }
}
