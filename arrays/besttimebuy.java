package arrays;

public class besttimebuy {
  
  public static int stockBuy(int prices[]){
       int minPrice=Integer.MAX_VALUE;
       int maxProfit=0;
       for(int i=0;i<prices.length;i++){
      minPrice=Math.min(minPrice,prices[i]);
       int Profit=prices[i]-minPrice;
       maxProfit=Math.max(maxProfit, Profit);
       } 
       return maxProfit;
  }
  public static void main(String[] args) {
    
    int prices[] = {7,1,5,3,6,4};
    System.out.println(stockBuy(prices));

  }
}
