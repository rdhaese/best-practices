
/**
 * Created by RDEAX37 on 18/09/2015.
 */
public class Person implements MyPrintJob {
    public final String firstName, lastName;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean print(MyPrinter printer){
        printer.addToQueue(this);
        return printer.startPrinting();
    }

    public void printDocument(Document document){
        document.print();
    }
}
