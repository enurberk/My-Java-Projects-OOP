
package javaapplication44;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class JavaApplication44 {

    public static void main(String[] args) {
    
        ArrayList<String> arraylist = new ArrayList();
        arraylist.add("e");
        arraylist.add("l");
        arraylist.add("i");
        arraylist.add("f");
        System.out.println(arraylist);
        arraylist.remove("e");
        System.out.println(arraylist);
        System.out.println("-------------");
        
        LinkedList linkedlist = new LinkedList();
        linkedlist.add(56);
        linkedlist.add(90);
        linkedlist.add(80);
        System.out.println(linkedlist);
        linkedlist.remove();
        System.out.println(linkedlist);
        linkedlist.remove();
        System.out.println(linkedlist);
        System.out.println("-------------");
        
        List<String> myList = new ArrayList<>();
        
        myList.add("Elif");
        myList.add("Hülya");
        myList.add("Mehmet");
        myList.add("Fatih");
        myList.add("Nurettin");
        myList.add("Nurber");
        
        ListIterator liter = myList.listIterator(myList.size());
        
        while(liter.hasPrevious()){
            System.out.println(liter.previous());
        }
        System.out.println("-------------");
        while(liter.hasNext()){
            System.out.println(liter.next());
        }
        System.out.println("-------------");
        System.out.println(myList);
        
        Collections.sort(myList);
        
        System.out.println(myList);
        
        Collections.reverse(myList);
        
        System.out.println(myList);
    }
}
