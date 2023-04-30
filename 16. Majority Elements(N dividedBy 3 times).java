class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        // Brute Force (Naive Approach)
        // for(int i=0; i<n; i++) {
        //     int count = 0;
        //     for(int j=0; j<n; j++) {
        //         if(nums[i] == nums[j]) {
        //             count++;
        //         }
        //     }
        //     if(count > n/3 && !ans.contains(nums[i])) {
        //         ans.add(nums[i]);
        //     }
        // }
        // return ans;

        // Hashing
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int mini = (int)(n / 3) + 1;
        // for (int i = 0; i < n; i++) {
        //     int value = map.getOrDefault(nums[i], 0);
        //     map.put(nums[i], value + 1);
        //     if (map.get(nums[i]) == mini) ans.add(nums[i]);
        //     if (ans.size() == 2) break;
        // }
        // return ans;
    
        // Extended Boyer Moore's Voting Algorithm
        int cnt1=0,cnt2=0, el1=Integer.MIN_VALUE, el2=Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            if(cnt1 == 0 && nums[i]!=el2) {
                cnt1=1;
                el1 = nums[i];
            } else if(cnt2 == 0 && nums[i] != el1) {
                cnt2 = 1;
                el2 = nums[i];
            } else if(nums[i] == el1) {
                cnt1++;
            } else if(nums[i] == el2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 =0; cnt2=0;
        for(int i=0; i<n; i++) {
            if(nums[i] == el1) cnt1++;
            if(nums[i] == el2) cnt2++;
        }
        
        int mini = (int)(n/3) + 1;
        if(cnt1 >= mini) ans.add(el1);
        if(cnt2 >= mini) ans.add(el2);

        return ans;
    }
}
