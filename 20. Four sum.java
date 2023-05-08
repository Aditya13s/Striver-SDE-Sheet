class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        // for(int i=0; i<n; i++) {
        //     for(int j=i+1; j<n; j++) {
        //         Set<Long> set = new HashSet<>();
        //         for(int k=j+1; k<n; k++) {
        //             long sum = nums[i] + nums[j];
        //             sum += nums[k];
        //             long fourth = target-sum;
        //             if(set.contains(fourth)) {
        //                 List<Integer> res = new ArrayList<>();
        //                 res.add(nums[i]);
        //                 res.add(nums[j]);
        //                 res.add(nums[k]);
        //                 res.add((int)fourth);

        //                 Collections.sort(res);
        //                 if(!ans.contains(res)) {
        //                     ans.add(res);
        //                 }
        //             }
        //             set.add((long)nums[k]);
        //         }
        //     }
        // }

        // return ans;

        Arrays.sort(nums);
        for(int i=0; i<n; i++) {
            if( i > 0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1; j<n; j++) {
                if(j > i+1 && nums[j] == nums[j-1]) continue;

                int k= j+1;
                int l = n-1;
                while(k < l) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if(sum == target) {
                        List<Integer> res = new ArrayList<>();
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[k]);
                        res.add(nums[l]);
                        ans.add(res);
                        k++;
                        l--;
                        while( k < l && nums[k] == nums[k-1]) k++;
                        while(k < l && nums[l] == nums[l+1]) l--;
                    } else if(sum < target) k++;
                    else l--;
                }
            }
        }

        return ans;
        
    }
}
