import java.util.Scanner;

public class VolOfSphere {

    public static void main(String[] args) {
        
        //volume of sphere => 4/3*pi*r*r*r

        Scanner sc=new Scanner(System.in);
        double r,result,pi=3.14;
        System.out.println("Enter Radius");
        r=sc.nextDouble();

        result=4.0/3.0*pi*r*r*r;

        System.out.println("Volume of sphere is "+result);
        sc.close();
    }
}