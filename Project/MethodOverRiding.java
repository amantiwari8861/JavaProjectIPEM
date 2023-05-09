class User 
{
    int id;
    String name;

    User() 
    {
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
        System.out.println("Admin Created");
    }
    void showPrivilages() {
        System.out.println("Admin can do anything");
    }
    void adminFxn()
    {
        System.out.println("Hii i am Admin");
    }
}
class SubAdmin extends Admin {
    void showPrivilages() {
        System.out.println("i can do crud operation on employees");
    }
    void subAdminFxn()
    {
        System.out.println("Hii i am SubAdmin");
    }
}
public class MethodOverRiding {
    public static void main(String[] args) {
        // Admin a=new Admin();
        // a.showPrivilages();

        // SubAdmin s=new SubAdmin();
        // s.showPrivilages();

        Admin a2=new SubAdmin();
        a2.showPrivilages();
        a2.adminFxn();
        // a2.subadminFxn();

    }
}