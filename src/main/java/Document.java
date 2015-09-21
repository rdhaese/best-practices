/**
 * Created by RDEAX37 on 18/09/2015.
 */
public class Document {

    public final String name, extension;

    public Document(String name, String extension) {
        this.name = name;
        this.extension = extension;
    }

    public void print(){
        System.out.println(getFullName());
    }

    public String getFullName(){
        return String.format("%s.%s", name, extension);
    }

}
