import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by RDEAX37 on 18/09/2015.
 */
public class MyPrinter {
    private Queue<MyPrintJob> jobs = new LinkedList<MyPrintJob>();

    public void addToQueue(MyPrintJob printJob){
        jobs.add(printJob);
    }

    public boolean startPrinting(){
         return false;//TODO Do complicated stuff
    }
}
