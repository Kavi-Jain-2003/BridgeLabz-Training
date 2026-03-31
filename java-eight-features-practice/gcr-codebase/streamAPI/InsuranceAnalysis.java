
import java.util.*;
import java.util.stream.*;

class Claim {
    String claimType;
    double claimAmount;

    Claim(String claimType, double claimAmount) {
        this.claimType = claimType;
        this.claimAmount = claimAmount;
    }

    public String getClaimType() {
        return claimType;
    }

    public double getClaimAmount() {
        return claimAmount;
    }
}

public class InsuranceAnalysis {
	public static void main(String[] args)
	{

        List<Claim> claims = Arrays.asList(
            new Claim("Health", 50000),
            new Claim("Vehicle", 20000),
            new Claim("Health", 30000),
            new Claim("Life", 100000),
            new Claim("Vehicle", 40000)
        );
        
        Map<String,Double> averageClaimAmount=claims.stream()
        		.collect(Collectors.groupingBy(Claim::getClaimType,
        				Collectors.averagingDouble(Claim::getClaimAmount)
        				));
        averageClaimAmount.forEach((type,avg)->
        System.out.println(type+" Average claim:"+avg)
        );

        
		
	}

}
