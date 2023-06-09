class User
{
    String name;
    String password;
    String college;
    public User()
    {
        college="IPEM";
        System.out.println("user class default constructor called");

    }
    public User( String name,String password) 
    {
        this.password = password;
        this.name = name;
        System.out.println("user class 2 parameterized constructor called");
    }
    void ShowUserDetails()
    {
        System.out.println("--------------------");
        System.out.println("name :"+name); 
        System.out.println("password :"+password); 
        System.out.println("College :"+college); 
    }
}
class Employee extends User
{
    int empid;
    double salary;
    public Employee(){}
    public Employee(int empid, double salary) {
        this.empid = empid;
        this.salary = salary;
    }
    public Employee(int empid, double salary,String name,String password) 
    {
        // super();
        // this.name=name;
        // this.password=password;
        super(name, password);
        this.empid = empid;
        this.salary = salary;
    }
    void showEmployeeDetails()
    {
        System.out.println("Employee id :"+empid); 
        System.out.println("Employee salary :"+salary); 
        super.ShowUserDetails();
        System.out.println(super.college);
        // System.out.println("name :"+name); 
        // System.out.println("password :"+password); 
    }

}
public class Super {
    public static void main(String[] args) {
        
        Employee emp=new Employee(101,500000,"Aman","aman1234");
        emp.showEmployeeDetails();
    }
}
