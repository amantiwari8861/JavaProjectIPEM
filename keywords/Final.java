// final class Bank
class Bank
{
    public final double INTEREST_RATE=7.9;

    void showInterestRate()
    {
        System.out.println("Interest Rate :"+INTEREST_RATE);
    }
    // final void greet()
    {

    }
}
class SBI extends Bank
{
    void greet()
    {

    }
}

public class Final {
    public static void main(String[] args) {
        
        Bank b=new Bank();
        // b.INTEREST_RATE=8.5;


    }
}
