import java.util.Scanner;

abstract class Employee
{
    double chargePerHour;
    double hours;
    double salary;
    
    abstract void calculateSalary(double hours);
    void distributeBonus()
    {
        System.out.println("We got bonus of "+((salary*30)*15/100));
    }
}
class PermanentEmployee extends Employee
{
    void calculateSalary(double hours)
    {
        chargePerHour=100;
        salary=hours*chargePerHour;
        System.out.println("Permanent's Employee Salary Slip");
        System.out.println("Your salary is "+salary+" per day");
        System.out.println("Your salary is "+salary*30+" per month");
        distributeBonus();
    }
}
class Intern extends Employee
{
    void calculateSalary(double hours)
    {
        chargePerHour=40;
        salary=hours*chargePerHour;
        System.out.println("Intern's Salary Slip");
        System.out.println("Your salary is "+salary+" per day");
        System.out.println("Your salary is "+salary*30+" per month");
        distributeBonus();
    }
}
public class TestAbstraction2
{
    public static void main(String[] args) 
    {

        Employee emp=null;
        // Employee e=new Employee();

        Scanner sc=new Scanner(System.in);
        System.out.println("Which type op employee u are :");
        String emptype=sc.next();
        if (emptype.equalsIgnoreCase("Permanent")) 
        {
            emp=new PermanentEmployee();
        } 
        else if(emptype.equalsIgnoreCase("Intern"))
        {
            emp=new Intern();
        }
        else 
        {
            System.out.println("pls enter a valid designation");
        }
        emp.calculateSalary(8);
        sc.close();
    }
}
