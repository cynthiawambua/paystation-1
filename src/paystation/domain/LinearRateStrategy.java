package paystation.domain;

public class LinearRateStrategy implements RateStrategy{
    LinearRateStrategy(){
        
    }
    public double calculateTime(int insertedSoFar){
        //System.out.println("We're in Linear\n");
        PayStationImpl ps = new PayStationImpl();
        ps.timeBought = insertedSoFar / 5 * 2; //for Alphatown
        return ps.timeBought;
    }
}
