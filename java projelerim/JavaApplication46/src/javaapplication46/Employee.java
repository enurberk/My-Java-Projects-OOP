
package javaapplication46;

public class Employee{
    private int ID;
    private String name;
    private int salary;

    public Employee(int ID, String name, int salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "ID=" + ID + ", name=" + name + ", salary=" + salary + '}';
    }    
}
