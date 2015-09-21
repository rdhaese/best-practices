import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by RDEAX37 on 18/09/2015.
 */
@RunWith(MockitoJUnitRunner.class)
public class FormulaServiceTest {

    @Mock
    private Calculator calculator;
    private FormulaService service;

    @Before
    public void setUp(){
        service = new FormulaService(calculator);
    }


    @Test
    public void isTheTimeElapsedAdded(){
       service.addTheTimeElapsed();
        int elapsed = service.secondsPassed();
        Mockito.verify(calculator).add(elapsed, FormulaService.HOP);
    }

    @Test
    public void isNumberOfRunsCalculatedCorrectly(){
        int elapsed = service.secondsPassed();
        service.numberOfRuns();
        Mockito.verify(calculator).divide(elapsed, FormulaService.HOP);
    }

    @Test
    public void isTimeSkipped(){
        Mockito.when(calculator.multiply(Mockito.anyInt(), Mockito.anyInt())).thenReturn(25);
        int elapsed = service.secondsPassed();
        int skipAhead = 5;
        service.skipAhead(skipAhead);
        Mockito.verify(calculator).add(elapsed, skipAhead * service.HOP);
        Mockito.verify(calculator).multiply(skipAhead, service.HOP);
    }
}
