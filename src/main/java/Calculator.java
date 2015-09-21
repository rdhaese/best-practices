import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Created by RDEAX37 on 18/09/2015.
 */
@Stateless
@LocalBean
public class Calculator {

    public int add(int x, int y){
        return x + y;
    }

    public int multiply(int x, int y){
        return x * y;
    }

    /**
     *
     * @param x
     * @param y Can not be 0!
     * @return
     */
    public int divide(int x, int y){
        return x / y;
    }

    public double sqrRoot(double x){
        return Math.sqrt(x);
    }
}
