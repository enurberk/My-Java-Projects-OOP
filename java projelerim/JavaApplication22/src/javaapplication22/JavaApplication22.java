
package javaapplication22;

import java.util.EnumSet;

public class JavaApplication22 {

    public static void main(String[] args) {
  
        CompanyName c = CompanyName.GOOGLE;
        System.out.println(c + " : " + c.description);
        
        for(CompanyName cn : CompanyName.values()){
            System.out.println(cn + " : " + cn.description);
        }
        for(CompanyName cn : EnumSet.range(CompanyName.MICROSOFT,CompanyName.AKINSOFT)){
            System.out.println(cn + " : " + cn.description);
        }
    }
    
}
