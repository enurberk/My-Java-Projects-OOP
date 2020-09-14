
package javaapplication33;

public class JavaApplication33 {

    public static void main(String[] args) {
        HourlyEmployee employee1 = new HourlyEmployee("Ali", 100,10,10);
        SalariedEmployee employee2 = new SalariedEmployee("Mehmet",200,500);
        CommissionEmployee employee3 = new CommissionEmployee("Fatih",300,1000000,0.2);
        BasePlusCommissionEmployee employee4 = new BasePlusCommissionEmployee("Elif",400,1000000,0.3,500000);
        
        Employee[] employees = new Employee[]{employee1,employee2,employee3,employee4};
        for(Employee employee : employees)
            System.out.println(employee.toString());
                
        
    }
    
}
