import java.util.ArrayList;
import java.util.List;

/**
 * Created by RDEAX37 on 18/09/2015.
 */
public class Family {

    private Person2 mother;
    private Person2 father;
    private List<Person2> children = new ArrayList<Person2>();

    public Family(){
        mother = new Person2();
        father = new Person2();
    }

    public void setFamilyName(String name){
        mother.setLastName(name);
        father.setLastName(name);
        for (Person2 child : children){
            child.setLastName(name);
        }
    }

    public void setMomsName(String name){
        mother.setFirstName(name);
    }

    public void setDadsName(String name){
        father.setFirstName(name);
    }

    public void setChildrenNames(String... names){
        for (int i = 0; i < names.length; i++){
            children.get(i).setFirstName(names[i]);
        }
    }

    public Person2 getMother() {
        return mother;
    }

    public void setMother(Person2 mother) {
        this.mother = mother;
    }

    public Person2 getFather() {
        return father;
    }

    public void setFather(Person2 father) {
        this.father = father;
    }

    public List<Person2> getChildren() {
        return children;
    }

    public void setChildren(List<Person2> children) {
        this.children = children;
    }
}
