class Car
{
    Engine e=new Engine("190 cc");//instance variable
    void startCar()
    {
        int num=55;//local variable
        e.startEngine();
        System.out.println("Starting the Car");
    }
}

public class TestHasA {
    public static void main(String[] args) {
        
    Car c=new Car();
    c.startCar();
    
    }
}
