class Solution {
    public int maxProfit(int[] prices) {

       //Brute Force 
       // int max = 0;
        // for(int i=0; i<prices.length-1; i++) {
        //     for(int j=i+1; j<prices.length; j++) {
        //         if((prices[j] - prices[i]) > max) {
        //             max = prices[j] - prices[i];
        //         }
        //     }
        // }
        // return max;


	// Optimal 
        int min = prices[0], profit =0;
        for(int i=1; i<prices.length; i++) {
            if(prices[i-1] < min) {
                min = prices[i-1];
            }
            if( profit < (prices[i] - min)) {
                profit = prices[i] - min;
            }
        }

        return profit;
    }
}
