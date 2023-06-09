interface Employee
{
    String companyName="IPEM soln pvt ltd.";//by default public static final
    void calculateSalary(double hours);//by default this is public abstract 

    default void giveBonus()
    {
        System.out.println("you will get bonus");
    }
}
class PermanentEmployee implements Employee
{
    @Override
    public void calculateSalary(double hours) {
        // companyName="xyz";
        System.out.println("given salary");
        System.out.println(Employee.companyName);
    }
}
public class interfaces {
    public static void main(String[] args) {
        
        PermanentEmployee p=new PermanentEmployee();
        p.calculateSalary(8);
    }
}
