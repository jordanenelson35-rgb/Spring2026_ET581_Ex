public class Employee{
    private String name;   // this will stores the employees name 
    private double salary;  // this will stores the employees salary

    private static int totalEmployees = 0; // will track the total of employees created.
   
   // with this constructor we initialize the name, salary and increment counter.
   public Employee(String name, double salary) { 
        this.name = name;
        this.salary = salary;
        totalEmployees++; // Increment static counter.
    }

    // this will return employee name.
    public String getName() {
        return name;
    }

    // this would update the name of a employee.
    public void setName(String name){
        this.name = name;
    }

    // this will return employee salary.
    public double getSalary() {
        return salary;
    }
    
    // this would update the salary of a employee.
    public void setSalary(double salary) {
        this.salary = salary; 
    }

    // then use this to display employee details.
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    // this will then print the number of employees.
    public static void printTotalEmployees(){
        System.out.println("Total Employees: " + totalEmployees);
    }

}