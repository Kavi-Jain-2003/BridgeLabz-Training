import java.util.*;
public class StockPriceLogger {
	public static void main(String[] args)
	{
		 List<Double> stockPrices = Arrays.asList(
		            1450.50, 1462.75, 1448.30, 1475.90
		        );

		 stockPrices.stream()
		 .forEach(price-> System.out.println("Stock price updated:"+price));
	}

}
