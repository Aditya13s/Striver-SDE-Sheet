public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        int count = 0;
        
        // Brute Force(Nested Loops)
        // for(int i=0; i<n; i++) {
        //     int xor = 0;
        //     for(int j=i; j<n; j++) {
        //         xor ^= A[j];
        //         System.out.println()
        //         if(xor == B) {
        //             count++;
        //         }
        //     }   
        // }
        // return count;

        // Optimal Approach (Hashing)
        int xr = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(xr, 1); 

        for (int i = 0; i < n; i++) {
            xr = xr ^ A[i];
            int x = xr ^ B;
            if (mpp.containsKey(x)) {
                count += mpp.get(x);
            }
            if (mpp.containsKey(xr)) {
                mpp.put(xr, mpp.get(xr) + 1);
            } else {
                mpp.put(xr, 1);
            }
        }
        return count;
    }
}
