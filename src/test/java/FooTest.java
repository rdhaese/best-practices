import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by RDEAX37 on 18/09/2015.
 */
@RunWith(MockitoJUnitRunner.class)
public class FooTest {

    @InjectMocks
    private Foo foo = new Foo();

    @Mock
    private Bar bar;

    private String arg;

    @Before
    public void setUp(){
        arg = "String1";
    }

    @Test
    public void testDoFoo(){
        String result = foo.doFoo(arg);

        ArgumentCaptor<FooBar> fooBarArgumentCaptor = ArgumentCaptor.forClass(FooBar.class);
        Mockito.verify(bar).doBar(fooBarArgumentCaptor.capture());

        FooBar captured = fooBarArgumentCaptor.getValue();

        assertNotNull(captured);
        assertEquals(arg, captured.string1);
        assertNotNull(result);

    }
}
