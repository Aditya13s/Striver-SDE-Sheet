public class Solution {
    public static long getInversions(long arr[], int n) {
        // Brute Force
        // int count = 0;
        // for(int i=0; i<n; i++) {
        //     for(int j=i+1; j<n; j++) {
        //         if(arr[i] > arr[j] && i < j) {
        //             count++;
        //         }
        //     }
        // }

        // return count;
        return mergeSort(arr, new long[n], 0, n-1);
    


    }

    public static long mergeSort(long arr[], long temp[], int left, int right) {
        int mid = 0;
        long counter = 0;
        if(right > left) {
            mid = (right+left)/2;
            counter += mergeSort(arr, temp, left, mid);
            counter += mergeSort(arr, temp, mid + 1, right);
            counter += merge(arr, temp, left, mid +1, right);

        }
        return counter;

    }

    public static long merge(long arr[], long temp[], int left, int mid, int right) {
        int i,j, k;
        int counter = 0;
        i=left;
        j=mid;
        k=left;
        while((i <= mid-1) && (j <= right)) {
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                counter += (mid-i);
            }
        }
        while(i <= mid-1) {
            temp[k++] = arr[i++];
        }

        while(j <=right) {
            temp[k++] = arr[j++];
        }
        for(i=left; i<=right; i++) {
            arr[i] = temp[i];
        }
        return (long)counter;
    }
}
