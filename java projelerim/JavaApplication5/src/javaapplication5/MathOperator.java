

package javaapplication5;

import java.util.Scanner;

public class MathOperator {
    //attributes
    float var1;
    float var2;
    float result = 0 ;
    Scanner scanner = new Scanner(System.in);
    
    //behaviours
    
    float Add(){
        return var1+var2;
    }
    float Divide(){
        return var1/var2;
    }
    float Substract(){
        return var1-var2;
    }
    float Multiply(){
        return var1*var2;
    }
    
    void InputVar(){
        System.out.println("Please enter var1:");
        var1 = scanner.nextFloat();
        System.out.println("Please enter var2:");
        var2 = scanner.nextFloat();
    }
    
    float ChooseWhichOperator(){
        System.out.println("Please choose 1 for Add, 2 for Divide, 3 for Substract, 4 for Multiply: ");
        int userSelection=scanner.nextInt();
        
        
        switch(userSelection){
            case 1:
                result = Add();
                break;
            case 2:
                result = Divide();
                break;
            case 3:
                result = Substract();
                break;
            case 4: 
                result = Multiply();
                break;
        }
        return result;
    }
    
    void PrintTheResult(){
        System.out.println("The result is:" + result);
    }
}
