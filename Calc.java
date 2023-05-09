class Calculator
{
    String modelNo="CASIO";

    // no argument no return type
    void showModelNo()
    {
        System.out.println("Model No : "+modelNo);
    }
    // no argument with return type
    double getPiValue()
    {
        return 3.14;
    } 
    // with argument no return type
    void add(double num1,double num2)
    {
        System.out.println("The sum is "+(num1+num2));
    }
    // with argument and return type
    double volOfCylinder(double r,double h)
    {
        // return 3.14*r*r*h;
        // return getPiValue()*r*r*h;
        return Math.PI*r*r*h;
    }

}
public class Calc {

    public static void main(String[] args) {
        
        Calculator calc=new Calculator();
        calc.showModelNo();
        double pi=calc.getPiValue();
        System.out.println(" Pi Value :"+pi);
        calc.add(10,30);

        double vol=calc.volOfCylinder(2,4);
        System.out.printf("the volume of cylinder is  %.2f \n",vol);

        System.out.println("the volume of cylinder is "+vol);

    }
}