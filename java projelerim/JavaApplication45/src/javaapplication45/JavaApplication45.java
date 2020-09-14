
package javaapplication45;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class JavaApplication45 {

    public static void main(String[] args) {
        
        Employee e1 = new Employee("Ali",600);
        Employee e2 = new Employee("Veli",200);
        Employee e3 = new Employee("Mehmet",300);
        Employee e4 = new Employee("Musa",700);
        Employee e5 = new Employee("Hayri",500);
        
        List<Employee> list = new LinkedList<>();
        
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        
        ListIterator iter=list.listIterator(5);
        while(iter.hasPrevious())
            System.out.println(iter.previous());
        
        System.out.println(list);
        
        Collections.sort(list);
        
        System.out.println(list);
    }    
}
