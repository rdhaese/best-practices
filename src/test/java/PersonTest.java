import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;

/**
 * Created by RDEAX37 on 18/09/2015.
 */
@RunWith(MockitoJUnitRunner.class)
public class PersonTest {

    private Person person;

    @Mock
    private MyPrinter printer;
    @Mock
    private Document document;

    @Before
    public void setUp(){
         person = new Person("Robin", "D'Haese");
    }

    @Test
    public void canPersonBePrinted(){
        Mockito.when(printer.startPrinting()).thenReturn(true);
        person.print(printer);
    }

    @Test
    public void isPrinted(){
        Mockito.when(printer.startPrinting()).thenReturn(true);
        assertTrue(person.print(printer));
    }

    @Test
    public void doesPrintingBehaveAsExpected(){
        Mockito.when(printer.startPrinting()).thenReturn(true);
        person.print(printer);
        Mockito.verify(printer).startPrinting();
        Mockito.verify(printer).addToQueue(person);
        Mockito.verifyNoMoreInteractions(printer);
    }

    @Test
    public void isNotPrinted() {
        Mockito.when(printer.startPrinting()).thenReturn(false);
        assertFalse(person.print(printer));
    }

    @Test
    public void isDocumentPrinted(){
        Mockito.doNothing().when(document).print();
        person.printDocument(document);
        Mockito.verify(document).print();
        Mockito.verifyNoMoreInteractions(printer);
    }

    @Ignore
    @Test //Cannot succeed, just poc
    public void isExceptionThrown(){
        Mockito.when(printer.startPrinting()).thenThrow(new Exception());
    }
}
