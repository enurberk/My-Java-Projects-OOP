
package javaapplication43;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class JavaApplication43 {

    public static void main(String[] args) {
        Collection collection = new ArrayList();
        
        collection.add("String");
        collection.add(97);
        collection.add(97);
        collection.add(new Student("jack", 19));
        
        Iterator iter = collection.iterator();
        
        while(iter.hasNext()){
            System.out.println(iter.next());
            iter.remove();
        }
        System.out.println(collection);
        
        Student s1 = new Student("ali",20);
        collection.add(s1);
        System.out.println(collection);
        
        collection.remove(s1);
        System.out.println(collection);
            
        collection.add("String");
        collection.add(97);
        collection.add(new Student("jack", 19));
        
        
        System.out.println(collection);
        System.out.println(collection.size());
        
        collection.remove("String");
        
        
        System.out.println(collection);
        System.out.println(collection.size());
        
        //collection.removeAll(collection);
        
        if(!collection.isEmpty()){
            System.out.println("There are elements in the collection.");
        }
        else{
            System.out.println("No elements in the collection.");
        }
        
        collection.clear();

        if(!collection.isEmpty()){
            System.out.println("There are elements in the collection.");
        }
        else{
            System.out.println("No elements in the collection.");
        }
        
    }    
}
