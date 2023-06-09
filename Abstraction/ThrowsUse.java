import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsUse {
    public static void main(String[] args) throws IOException, IllegalAccessException{
        
    
    // try 
    // {
        BufferedInputStream b=new BufferedInputStream(new FileInputStream("hello.txt"));

        byte barr[]=b.readAllBytes();
        System.out.println(new String(barr));
        b.close();
    // } 
    // catch ( IOException e) 
    // {
    //     e.printStackTrace();
    //     b.close();
    // }

        String name="nidhi";

        if(name.equals("Aman"))
        {
            System.out.println("Login succesfull!!");
        }
        else{
            throw new IllegalAccessException("Login unsuccesfull");
        }

        System.out.println("Hello 1");
        System.out.println("Hello 1");
        System.out.println("Hello 1");
        System.out.println("Hello 1");

    }
}