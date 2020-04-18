package Arrays.Easy;

/*
 * 121. Best Time to Buy and Sell Stock
Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.

 */
public class BuyAndSellStock {
	public static void main(String[] args) {
       int result =  new BuyAndSellStock().maxProfit(new int[] {2,4,1});
	}

	public int maxProfit(int[] prices) {
		 int maxProfit = 0;
		 if(prices.length == 0)
			 return 0;
         int minValue = prices[0];
         int maxValue = prices[0];
         for(int i=0; i< prices.length; i++) {
        	 int curr = prices[i];
        	 if(curr < minValue) {
        		 minValue =  curr;
        		 maxValue = 0;
        	 }
        	 if(curr > maxValue) { // when ever we encounter max, we cal profit again
        		 maxValue = curr;
        		 maxProfit =  Math.max(maxProfit, maxValue - minValue);
        	 }
        		
         }
         return maxProfit;
	}
}
