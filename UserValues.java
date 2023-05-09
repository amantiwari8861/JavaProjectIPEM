import java.util.Scanner;

public class UserValues {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        // System.out.println("Enter the value of Num(int)");
        // int num=sc.nextInt();
        // System.out.println("value of variable = "+num);

        System.out.println("Enter the value of byte");
        byte b=sc.nextByte();
        System.out.println("value of variable = "+b);

        System.out.println("Enter the value of short");
        int s=sc.nextShort();
        System.out.println("value of variable = "+s);

        System.out.println("Enter the value of int");
        int num=sc.nextInt();
        System.out.println("value of variable = "+num);

        System.out.println("Enter the value of long");
        long l=sc.nextLong();
        System.out.println("value of variable = "+l);

        System.out.println("Enter the value of float");
        float f=sc.nextFloat();
        System.out.println("value of variable = "+f);

        System.out.println("Enter the value of double");
        double d=sc.nextDouble();
        System.out.println("value of variable = "+d);

        System.out.println("Enter the value of boolean");
        boolean bl=sc.nextBoolean();
        System.out.println("value of variable = "+bl);

        System.out.println("Enter the value of char");
        char ch=sc.next().charAt(0);
        System.out.println("value of variable = "+ch);




    }
}
