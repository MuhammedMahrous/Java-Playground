package scattering;

public class Main {
    public static void main(String[] args) {
        /*
        *
        * Here both class A and B has functions that use implicitly
        * Impl's doSomething()
        * If at any point doSomething is changed then all calls to it
        * will need to be changed
        *
        * */
        A a = new A();
        B b = new B();
        a.doA();
        b.doB();


    }
}
