public class Throws 
{
    void divide() throws ArithmeticException
    {
        System.out.println(1/0);
    }
    public static void main(String[] args) {
        
        System.out.println("hello 1");
        System.out.println("hello 1");
        System.out.println("hello 1");
        Throws t=new Throws();
        try
        {
            t.divide();
        }
        catch(ArithmeticException a)
        {
            System.out.println("pls do not divide by zero");
            a.printStackTrace();
        }
        finally
        {
            System.out.println("i will run always");
        }
        System.out.println("hello 1");
        System.out.println("hello 1");
        System.out.println("hello 1");
        System.out.println("hello 1");

    }
}
