import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by RDEAX37 on 18/09/2015.
 */
@RunWith(MockitoJUnitRunner.class)
public class BarTest {

    private FooBar fooBar;
    private Bar bar;

    @Before
    public void setUp(){
        fooBar = new FooBar();
        bar = new Bar();
    }

    @Test
    public void testDoBar(){
        assertNull(fooBar.string1);
        assertNull(fooBar.string2);
        assertNull(fooBar.string3);
        bar.doBar(fooBar);
        assertEquals("string2", fooBar.string2);
        assertEquals("string3", fooBar.string3);
    }
}
