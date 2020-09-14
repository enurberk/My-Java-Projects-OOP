
package javaapplication40;

interface A{
    void A();
}

interface B extends A{
    void B();
}

interface C extends A,B{
    void C();
}

public class TestClass implements C{

    @Override
    public void C() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void A() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void B() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

