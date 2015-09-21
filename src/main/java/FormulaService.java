import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Startup;
import javax.ejb.Stateful;

/**
 * Created by RDEAX37 on 18/09/2015.
 */
@Stateful
@Startup
public class FormulaService {
    @EJB
    private Calculator calculator;
    public static final int HOP = 5;
    private int secondsElapsed = 0;


    public FormulaService(Calculator calculator){
        this.calculator = calculator;
    }

    @Schedule(second = "*/" + HOP, minute = "*", hour = "*", persistent = false)
    public void addTheTimeElapsed(){
        secondsElapsed = calculator.add(secondsElapsed, HOP);
    }

    public int secondsPassed(){
        return secondsElapsed;
    }

    public int numberOfRuns(){
        return calculator.divide(secondsPassed(), HOP);
    }

    public void skipAhead(int skipCount){
        secondsElapsed = calculator.add(secondsElapsed, calculator.multiply(HOP, skipCount));
    }



}
