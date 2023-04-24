public class Solution { 
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
	// Brute Force
        // int [] freq = new int[n+1];
        // for(int i=0; i<n; i++) {
        //     freq[arr.get(i)]++;
        // }
        // int [] ans = new int[2];
        // for(int i=1; i<freq.length; i++) {
        //     if(freq[i] > 1) {
        //         ans[1] = i;
        //     } else if (freq[i] == 0) {
        //         ans[0] = i;
        //     }
        // }
        // return ans;
        
        
	// Optimal Approach (Absolute Value)
        // int[] ans = new int[2];
        // for(int i=0; i<n; i++) {
        //     int abs_value = Math.abs(arr.get(i));
        //     if(arr.get(abs_value-1)>0) {
        //         arr.set(abs_value-1, -arr.get(abs_value-1));
        //     } else {
        //         ans[1] = abs_value;
        //     }
        // }
        // for(int i=0; i<n; i++) {
        //     if(arr.get(i) > 0) {
        //         ans[0] = i+1;
        //     }
        // }
        // return ans;

        // Optimal Approach (XOR)
        int xor = 0;

        
        for(int i=0; i<n; i++) {
            xor ^= arr.get(i);
        }
        for(int i=1; i<=n; i++) {
            xor ^= i;
        }
        //xor of missing and repeating number found now we have to identify the numbers.


        //Right Most Set bit
        int rsb = xor & -xor;

        //Identifying The numbers
        int x = 0; 
        int y = 0;

        for(int val: arr) {
            if((val & rsb) == 0) {
                x ^= val;
            } else {
                y ^= val;
            }
        }
        for(int i=1; i<=n; i++) {
            if((i & rsb) == 0) {
                x ^= i;
            } else {
                y ^= i;
            }
        }
        int [] ans = new int[2];
        for(int val: arr) {
            if(val == x) {
                ans[0] = y;
                ans[1] = x;
            } else if(val == y) {
                
                ans[1] = y;
                ans[0] = x;
            }
        }
        return ans;       
    }

}
