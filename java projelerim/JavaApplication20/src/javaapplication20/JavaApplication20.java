
package javaapplication20;

public class JavaApplication20 {
    
    public static void main(String[] args) {
        test1();
        JavaApplication20 j1 = new JavaApplication20();
        j1.test();
    }
    
    void test(){
        System.out.println("from non static it is need that object for work!");
        test1();//we can call static method inside of non static
    }
    static void test1(){
        System.out.println("from static, do not need object :)");
    }
    
}
