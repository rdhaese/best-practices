import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.times;

/**
 * Created by RDEAX37 on 18/09/2015.
 */
@RunWith(MockitoJUnitRunner.class)
public class FamilyTest {

    @InjectMocks
    private Family family = new Family();

    @Mock(name = "father")
    private Person2 father;
    @Mock (name = "mother")
    private Person2 mother;

    @Mock
    private Person2 child1;
    @Mock
    private Person2 child2;


    @Before
    public void setUp(){
        List<Person2> children = new ArrayList<Person2>();
        children.add(new Person2());
        children.add(new Person2());
        family.setChildren(children);
    }

    @Test
    public void isLastNameSetOnFamily(){
        String lastName = "lastName";
        family.setFamilyName(lastName);
        Mockito.verify(father, times(1)).setLastName(lastName);
        Mockito.verify(mother, times(1)).setLastName(lastName);
        Mockito.verify(child1, times(1)).setLastName(lastName);
        Mockito.verify(child2, times(1)).setLastName(lastName);
    }

    @Test
    public void isMothersNameSet(){
        String name= "name";
        family.setMomsName(name);
        Mockito.verify(mother, times(1)).setFirstName(name);
        Mockito.verifyNoMoreInteractions(mother, father);
    }

    @Test public void isFathersNameSet(){
        String name= "name";
        family.setDadsName(name);
        Mockito.verify(father, times(1)).setFirstName(name);
        Mockito.verifyNoMoreInteractions(father, mother);
    }

    @Test
    public void areChildrenNamesSet(){

    }

}
