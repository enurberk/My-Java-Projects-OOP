
package javaapplication47;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class JavaApplication47 {

    public static void main(String[] args) {
        
        Set<String> mySet = new HashSet();
        
        mySet.add("elif");
        mySet.add("nurber");
        mySet.add("karakaş");
        mySet.add("eymen");
        mySet.add("elif");
        mySet.add("fatih");
        
        System.out.println(mySet);
        
        if (!mySet.contains("emre")) {
            System.out.println("there is no username : emre");
        }
        
        Iterator iter = mySet.iterator();
        
        while(iter.hasNext()){
            System.out.println(iter.next());
            iter.remove();
        }
        
        System.out.println(mySet);
        
        mySet.add("elif");
        mySet.add("nurber");
        mySet.add("karakaş");
        mySet.add("eymen");
        mySet.add("elif");
        mySet.add("fatih");
        
        System.out.println(mySet);
        
        Set<String> myTreeSet = new TreeSet<>();
        myTreeSet.addAll(mySet);
        System.out.println(myTreeSet);
    }    
}
