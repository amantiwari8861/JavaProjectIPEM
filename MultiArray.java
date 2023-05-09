import java.util.Scanner;

public class MultiArray {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String country[]={"india","america","australia"};
        String countryStates[][]={
            {"Delhi","Mumbai","Banglore","Kolkata"},
            {"new york","san fransisco","texas","san diego"},
            {"sydney","melburn","walec","columbia"}
        };

        int covidCases[][]=new int[3][4];

        for (int i = 0; i < country.length; i++) 
        {
            System.out.println("Enter covid cases in "+country[i]);
            for (int j = 0; j < 4; j++) 
            {
                System.out.print(countryStates[i][j]+" : ");
                covidCases[i][j]=sc.nextInt();
            }
        }
        System.out.println("\n\t\t\tCovid cases in All countries\n");
        for (int i = 0; i < covidCases.length; i++) 
        {
            System.out.print("Codid Cases in "+country[i]+" : ");
            for(int j=0;j<covidCases[0].length;j++)
            {
                System.out.print("\t"+countryStates[i][j]+":"+covidCases[i][j]+",");
            }
            System.out.println();
        }

    }
}