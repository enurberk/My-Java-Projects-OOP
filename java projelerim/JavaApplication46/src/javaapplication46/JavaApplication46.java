
package javaapplication46;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class JavaApplication46 {

    public static void main(String[] args) {
        
        Employee e1 = new Employee(900,"ali",1500);
        Employee e2 = new Employee(200,"veli",2500);
        Employee e3 = new Employee(800,"mehmet",8500);
        Employee e4 = new Employee(400,"fatih",4500);
        Employee e5 = new Employee(100,"hayri",5500);
     
        List<Employee> myList = new LinkedList();
        
        IDComparator idcomp = new IDComparator();
        NameComparator namecomp = new NameComparator();
        SalaryComparator salarycomp = new SalaryComparator();
     
        myList.add(e1);
        myList.add(e2);
        myList.add(e3);
        myList.add(e4);
        myList.add(e5);     
        
        
        
        
        System.out.println("***********");
        System.out.println("***********");
        System.out.println("iterator ile baştan yazdır");
        ListIterator iter = myList.listIterator(0);
        while(iter.hasNext())
            System.out.println(iter.next());
        System.out.println("iterator ile tersten yazdır");        
        iter = myList.listIterator(5);
        while(iter.hasPrevious())
            System.out.println(iter.previous());
        System.out.println("***********");
        System.out.println("***********");
        
        
        
        
        System.out.println("Firsts Inputs --->");
        
        iter = myList.listIterator(0);
        while(iter.hasNext())
            System.out.println(iter.next());
//        for(Employee e : myList){
//            System.out.println(e); 
//        }
        
        System.out.println("***********");
        
        System.out.println("Before - Name Comparator");
        
        iter = myList.listIterator(0);
        while(iter.hasNext())
            System.out.println(iter.next());
//        for(Employee e : myList){
//            System.out.println(e); 
//        }
        
        System.out.println("-------------");
        
        myList.sort(namecomp);
       
        System.out.println("After - Name Comparator");
        
        for(Employee e : myList){
            System.out.println(e); 
        }
         
        System.out.println("***********");
        
        System.out.println("Before - ID Comparator");
        
        for(Employee e : myList){
            System.out.println(e); 
        }
        
        System.out.println("-------------");
        
        myList.sort(idcomp);
        
        System.out.println("After - ID Comparator");
        
        for(Employee e : myList){
            System.out.println(e); 
        }
         
        System.out.println("**********");
        
        System.out.println("Before - Salary Comparator");
        
        for(Employee e : myList){
            System.out.println(e); 
        }
      
        System.out.println("-------------");
        
        myList.sort(salarycomp);
        
        System.out.println("After - Salary Comparator");
        
        for(Employee e : myList){
            System.out.println(e); 
        }
    }
}
