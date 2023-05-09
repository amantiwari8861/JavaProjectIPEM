import java.util.Scanner;

public class Character {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Name");
        String fname=sc.next();

        sc.nextLine();
        System.out.println("Enter Full Name");
        String fullname=sc.nextLine();

        System.out.println("Enter the value of char");
        char ch=sc.next().charAt(0);

        System.out.println("value of fname = "+fname);
        System.out.println("value of fullname = "+fullname);
        System.out.println("value of ch = "+ch);
        sc.close();
    }
}