class GfG {
    int maxLen(int arr[], int n){
        // Brute Force(Naive Approach)
        // int maxCount = 0;
        // for(int i=0; i<n; i++) {
        //     int sum = 0;
        //     for(int j=i; j<n; j++) {
        //         sum+=arr[j];
        //         if(sum == 0) {
        //             maxCount = Math.max(maxCount, j-i+1);
        //         }
        //     }
        // }
        
        // return maxCount;
        
        // Optimal Approach (Hashmap)
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        for(int i=0; i<arr.length; i++) {
            sum+=arr[i];
            if(arr[i] == 0 && maxLength == 0) {
                maxLength = 1;   
            }
            if(sum == 0) {
                maxLength = i+1;
            }
            if(map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i-map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLength;
        
    }
}