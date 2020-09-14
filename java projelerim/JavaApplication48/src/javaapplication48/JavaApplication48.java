
package javaapplication48;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class JavaApplication48 {

    public static void main(String[] args) {
        
        Map<Integer, String> myMap = new HashMap();
        
        myMap.put(1, "Ali");
        myMap.put(4, "Veli");
        myMap.put(7, "Mehmet");
        myMap.put(9, "Veysel");
        myMap.put(5, "Hayri");
        myMap.put(5, "ayri");
        
        System.out.println("HashMap -> " + myMap);
        
        for(Integer key : myMap.keySet()){
            String value = myMap.get(key);
            System.out.println("Value with keySet() -> " + value);
        }
        
        myMap.remove(5);
        System.out.println("Remove sth (5) -> " + myMap);
        
        //Collection value = myMap.values();
        System.out.println("Just show values with values() -> " + myMap.values());
       
        System.out.println("entrySet() -> " + myMap.entrySet());
        
        System.out.println("get(4) -> " + myMap.get(4));        
       
        myMap.putIfAbsent(5, "mehmet");
        
        System.out.println("putIfAbsent() -> " + myMap);
        
        if( myMap.containsKey(6)){
            System.out.println("there is 6 key in the HashMap");
        }
        else{
            System.out.println("there is no 6 key ");
        }
//        
//        while(!myMap.isEmpty()){
//            myMap.clear();
//        }
//        System.out.println(myMap);
        
        Map<Integer, String> myTreeMap = new TreeMap();
        myTreeMap.putAll(myMap);
        System.out.println("Tree Map -> " + myTreeMap);
        
        System.out.println("*******************");
        
        Map<String, Integer> myHashMap = new HashMap<>();
        
        myHashMap.put("Ali",1);
        myHashMap.put("Veli",4);
        myHashMap.put("Mehmet",7);
        myHashMap.put("Veysel",9);
        myHashMap.put("Hayri",5);
        myHashMap.put("Ayri",5);
        
        System.out.println("HashMap : " + myHashMap);
        
        Map<String, Integer> myTreeMap2 = new TreeMap<>();
        
        myTreeMap2.putAll(myHashMap);
        
        System.out.println("TreeMap : " + myTreeMap2);
        
    }    
}

//package javaapplication48;
//import java.util.Scanner;
//
//public class JavaApplication48 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		//GIRILEN SAYININ ASAL OLUP OLMADIGINI BULAN PROGRAM
//			Scanner input = new Scanner(System.in);
//			int girilen = input.nextInt();
//			int sayac1=1;
//			int sayac2=0;
//			int mevcutSayi=2;
//			boolean asalmi=true;
//			
//				while(mevcutSayi < girilen)
//				{
//					while(sayac1<mevcutSayi)
//					{
//						
//						if(mevcutSayi % sayac1 == 0)
//						{
//							sayac2++;
//						}
//						
//						if(sayac2 > 2)
//						{
//							asalmi=false;
//							System.out.println(mevcutSayi + " " + asalmi);
//						}
//						sayac1++;
//					}
//					sayac2=0;
//					mevcutSayi++;
//					sayac1=1;
//				}
//			
//			if(asalmi)
//				System.out.println(girilen + " degeri asaldir");
//			else
//			System.out.println(girilen + " degeri asal degildir");
//		}
//				
//			
//
//			
//		
//		
//}
