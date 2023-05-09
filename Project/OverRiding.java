import java.util.Scanner;

class Bike {
    double speed = 100;
    String modelNo;

    void showSpeed() {
        System.out.println("Top speed of default Bike is " + speed);
    }
}
class Splender extends Bike
{
    double speed = 110;
    void showSpeed() {
        System.out.println("Top speed of Splender is " + speed);
    }
}
class Duke extends Bike
{
    double speed = 160;
    void showSpeed() {
        System.out.println("Top speed of Duke is " + speed);
    }
}
class KawasakiNinja extends Bike
{
    double speed = 300;
    void showSpeed() {
        System.out.println("Top speed of KawasakiNinja is " + speed);
    }
}

public class OverRiding {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter bike u  want to puchase");
        String bikeName=sc.next();

        Bike b=null;

        if(bikeName.equalsIgnoreCase("bike"))
        {
            b=new Bike();
        }
        else if(bikeName.equalsIgnoreCase("splender"))
        {
            b=new Splender();
        }
        else if(bikeName.equalsIgnoreCase("duke"))
        {
            b=new Duke();
        }
        else if(bikeName.equalsIgnoreCase("kawasakininja"))
        {
            b=new KawasakiNinja();
        }
        else
        {
            System.out.println("Invalid Bike name");
        }
        b.showSpeed();
        sc.close();
    }
}