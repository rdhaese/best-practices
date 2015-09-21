/**
 * Created by RDEAX37 on 18/09/2015.
 */
public class Foo {

    private Bar bar = new Bar();

    public String doFoo(String argumentForString1){
        FooBar fb = new FooBar();
        fb.string1 = argumentForString1;
        bar.doBar(fb);
        return fb.string1 + fb.string2 + fb.string3;
    }
}
