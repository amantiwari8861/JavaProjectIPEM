public class ExceptionHandling 
{
    public static void main(String[] args) {
        
        System.out.println("hello 1");
        System.out.println("hello 1");
        System.out.println("hello 1");
        try
        {
            System.out.println(1/0);
        }
        catch(ArithmeticException a)
        {
            System.out.println("pls do not divide by zero");
            a.printStackTrace();
        }
        System.out.println("hello 1");
        System.out.println("hello 1");
        System.out.println("hello 1");
        System.out.println("hello 1");

    }
}
