import java.util.*;
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length; //Max Row
        int n = matrix[0].length; //Max Colm
        // Set<Integer> rows = new HashSet<Integer>();
        // Set<Integer> cols = new HashSet<Integer>();

        //Searching for Zeroes in The Array
        // for(int i=0; i<m; i++) {
        //     for(int j=0; j<n; j++) {
        //         if(matrix[i][j] == 0) {
        //             rows.add(i);
        //             cols.add(j);
        //         }
        //     }
        // }
        // for(int i=0; i<m; i++) {
        //     for(int j=0; j<n; j++) {
        //         if(rows.contains(i) || cols.contains(j)) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }
        boolean row = false;
        boolean col = false;

        for(int i=0; i<m; i++) {
            if(matrix[i][0] == 0) {
                col = true;
            }
        }


        for(int j=0; j<n; j++) {
            if(matrix[0][j] == 0) {
                row = true;
            }
        }

        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                if(matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        
        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if(row) {
            for(int j=0; j<n; j++) {
                matrix[0][j] = 0;
            }
        }

        
        if(col) {
            for(int i=0; i<m; i++) {
                matrix[i][0] = 0;
            }
        }
        System.out.println(Arrays.toString(matrix));
        
    }
}
