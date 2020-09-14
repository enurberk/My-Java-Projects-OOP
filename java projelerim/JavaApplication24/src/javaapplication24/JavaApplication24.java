
package javaapplication24;

public class JavaApplication24 {

    public static void main(String[] args) {
            
        Employee e1 = new Employee(100, "Jack");
        Employee e2 = new Employee(200, "Jane");
        
        CompanyNames cn = CompanyNames.AKINSOFT;
        
        Company c1 = new Company(e1,cn);
        Company c2 = new Company(e2, CompanyNames.IBM);
        
        Company[] comps = new Company[2];
        //Company[] comps = new Company[]{
        //c1,c2}
        comps[0]=c1;
        comps[1]=c2;
        
        for(int i=0 ; i<comps.length ; i++){
            System.out.println("Company of " + (i+1) + " : " + comps[i].getCompanyName());
        }
        
        System.out.println(c1.getEmployee().getId() + " " + c1.getEmployee().getName() + " " + c1.getCompanyName().name() + " : " + c1.getCompanyName().getDescription());
        System.out.println(c2.getEmployee().getId() + " " + c2.getEmployee().getName() + " " + c2.getCompanyName().name());
    }
    
}
