
package javaapplication35;

public class JavaApplication35 {

    public static void main(String[] args) {
        Salary s1 = new FullTimeEmployee("Elif",2500);
        Salary s2 = new PartTimeEmployee("Mehmet",20,5);
        System.out.println(s1.CalculateSalary());
        System.out.println(s2.CalculateSalary());
    }
}
