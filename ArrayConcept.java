import java.util.Scanner;

public class ArrayConcept {
    public static void main(String[] args) {
        

        // int num[56];
        // int num[]=new int[50];

        // int marks[];
        // marks=new int[5];

        String names[];

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total names count");
        int size=sc.nextInt();
        sc.nextLine();
        names=new String[size];

        System.out.println("Enter namses:");
        for (int i = 0; i < names.length; i++)
        {
            names[i]=sc.nextLine();
        }
        System.out.println("All names are");
        for (String name : names)
        {
            System.out.println(name);
        }
        sc.close();
    }
}
