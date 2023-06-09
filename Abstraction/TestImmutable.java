public class TestImmutable {
    public static void main(String[] args) {
        

        // String s="Aman";
        // s.concat("Tiwari");
        // System.out.println(s);
        
        // System.out.println("Aman" instanceof String);

        // char ch="Aman".charAt(1);
        // System.out.println(ch);

        // String fullName="Aman".concat(" Tiwari");
        // System.out.println(fullName);
        // System.out.println(fullName.length());

        String s=new String("Aman");
        String s2="Aman";

        System.out.println(s==s2);

        String s3="Aman";

        System.out.println(s2==s3);

        System.out.println(s.equals(s2));

        StringBuffer b=new StringBuffer("Aman");
        b.append(" Tiwari");
        System.out.println(b);

        StringBuilder sb=new StringBuilder("Aman");
        
    }
}
