public class BestTimeToBuyAndSellStocks {
    public static int maxProfit(int[] prices)
    {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int price: prices)
        {
            if(price<minPrice)
            {
                minPrice=price;//time to buy
            }
            else if(price-minPrice<maxProfit)
            {
                maxProfit=price-minPrice;//time to sell
            }
        }
        return maxProfit;
    }
  public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + maxProfit(prices));

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Maximum Profit: " + maxProfit(prices2));
    }   
}
