class Animal
{
    
}
interface Lion
{
    void getBodySize();
}
interface Tiger
{
    void getSharpMind();
}
class Liger extends Animal implements Lion,Tiger
{

    @Override
    public void getSharpMind() {
    }

    @Override
    public void getBodySize() {
    }

}
public class Multiple 
{
    public static void main(String[] args) {
        

        Lion l=new Liger();
        Tiger t=new Liger();


    }
}
