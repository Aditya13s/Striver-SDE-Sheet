class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;

        // for(int i=0; i<n; i++) {
        //     if(target <= matrix[i][m-1]) {
        //         int low =0;
        //         int high = m-1;
        //         while(low <= high) {
        //             int mid = low + (high-low)/2;
        //             if(matrix[i][mid] == target) {
        //                 return true;
        //             } else if(matrix[i][mid] < target) {
        //                 low = mid+1;
        //             } else {
        //                 high = mid-1;
        //             }
        //         }

        //     }
        // }
        // return false;

        //Optimal
        int lo = 0;
        int hi = (n*m)-1;
        while(lo<=hi) {
            int mid = lo + (hi-lo)/2;
            int curr = matrix[mid/m][mid%m];
            if(curr == target) {
                return true;
            } else if(curr < target) {
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return false;
    }
    
}
