
package javaapplication24;

public class Company {
    
    private Employee employee;
    private CompanyNames companyName;
    
    public Company(Employee e, CompanyNames n){
        this.employee=e;
        this.companyName=n;
    }
    public CompanyNames getCompanyName(){
        return companyName;
    }
    public Employee getEmployee(){
        return employee;
    }
}
