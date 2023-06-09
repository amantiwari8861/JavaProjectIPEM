class User
{
    int id;
    String name;
    String password;
    long phoneno;
    String college;
    public User()
    {
        college="IPEM";
    }
    public User(int id) 
    {
        this();
        
        this.id = id;
    }
    public User(int id, String name) 
    {
        // this.id = id;
        this(id);
        this.name = name;
    }
    public User(int id, String name, String p) 
    {
        // this.id = id;
        // this.name = name;
        this(id,name);
        password = p;
    }
    public User(int id, String name, String p, long phoneno) 
    {
        // this.id = id;
        // this.name = name;
        // password = p;
        this(id,name,p);
        this.phoneno = phoneno;
        //this represents to current class object
    }
    void ShowUserDetails()
    {
        System.out.println("--------------------");
        System.out.println("id :"+id); 
        System.out.println("name :"+name); 
        System.out.println("password :"+password); 
        System.out.println("phone No :"+phoneno); 
        System.out.println("College :"+college); 
    }
}
class This
{
    public static void main(String[] args) {
        
        User u=new User(100,"Aman","Aman7776",9891062743L);
        u.ShowUserDetails();
    }
}