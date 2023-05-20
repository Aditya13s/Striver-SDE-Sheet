class Solution {
    public void rotate(int[][] matrix) {

        // Complex Approach
        // for(int i=0; i<(n+1)/2; i++) {
        //     for(int j=0; j<n/2; j++) {
        //         int temp = matrix[n-1-j][i];
        //         matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
        //         matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
        //         matrix[j][n-1-i] = matrix[i][j];
        //         matrix[i][j] = temp;
        //     }
        // }

        // Optimal & Simple Approach
        transpose(matrix);
        reverse(matrix);
        
    }

    public void transpose(int [][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                swap(matrix, i, j);
            }
        }
    }

    public void reverse(int [][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }

    public void swap(int [][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}
