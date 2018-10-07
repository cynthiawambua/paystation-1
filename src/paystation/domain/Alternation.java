package paystation.domain;
import java.util.Scanner;
import paystation.domain.LinearRateStrategy;
import paystation.domain.ProgressiveRateStrategy;



public class Alternation implements RateStrategy/*extends LinearRateStrategy*/{
    int yn;
    Scanner menu = new Scanner(System.in);
    //PayStationImpl ps = new PayStationImpl();
    Alternation(){ //constructor
        System.out.println("Is it a weekend? 1 for yes and 2 for no");
        yn = menu.nextInt();
    }
    
    /*We gotta figure this one out*/
    public double calculateTime(int insertedSoFar){
        
         LinearRateStrategy lrs = new LinearRateStrategy();
         ProgressiveRateStrategy prs = new ProgressiveRateStrategy();
         PayStationImpl ps = new PayStationImpl();
        switch(yn){
            case 1: //weekend
                ps = new PayStationImpl(prs);
                //ps.timeBought = (int)prs.calculateTime(ps.insertedSoFar);//implement progressive rate strategy
                break;
                
            case 2: //weekday
                ps = new PayStationImpl(lrs);
                //ps = new PayStationImpl(lrs); //implement linear rate strategy
                break;                  
        }      
        return ps.timeBought;
    }

    
    
    
    
    
}
