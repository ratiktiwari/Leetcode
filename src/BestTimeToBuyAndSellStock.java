import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int currentProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            currentProfit = prices[i] - minPrice;
            if(maxProfit < currentProfit){
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }

}
