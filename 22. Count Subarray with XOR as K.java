public class Solution {
    public int solve(int[] A, int B) {
        
        // Brute Force(Nested Loops)
        int count = 0;
        int n = A.length;
        for(int i=0; i<n; i++) {
            int xor = 0;
            for(int j=i; j<n; j++) {
                xor ^= A[j];
                System.out.println()
                if(xor == B) {
                    count++;
                }
            }   
            
        }
        
        return count;
    }
}
l̥l̥