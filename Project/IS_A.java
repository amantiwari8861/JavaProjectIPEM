class User {
    int id;
    String name;

    User() {
        System.out.println("User Created");
        id = 100;
        name = "aman";
    }

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void showcredentials() {
        System.out.println(" Id :" + id);
        System.out.println(" Name :" + name);
    }
}

class Admin extends User {
    Admin() {
        // super(200,"Raj kishore");
        System.out.println("Admin Created");
    }

    void showAdminPrivilages() {
        System.out.println("Admin can do anything");
    }

}

class SubAdmin extends Admin {
    void subAdminPrivilages() {
        System.out.println("i can do crud operation on employees");
    }
}

class Employee extends User {
    double salary;

    Employee() {
        salary = 50000;
    }

    void showSalary() {
        System.out.println("Salary is " + salary);
    }
}

public class IS_A {
    public static void main(String[] args) {

        // Admin a=new Admin();
        // a.showcredentials();

        // SubAdmin s=new SubAdmin();
        // s.showcredentials();
        // s.showAdminPrivilages();
        // s.subAdminPrivilages();

        Employee emp = new Employee();
        emp.showcredentials();
        emp.showSalary();

        System.out.println(emp instanceof Employee);
        System.out.println(emp instanceof Object);

    }
}
