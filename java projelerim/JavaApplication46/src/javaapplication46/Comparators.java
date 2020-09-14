
package javaapplication46;

import java.util.Comparator;

class NameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}
class IDComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getID() -o2.getID();
    }
}
class SalaryComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary() -o2.getSalary();
    }
}

