// class Student
// {
//     int rollNo;
//     String name;
//     String collegeName;

//     Student(){}
//     Student(int rollNo, String name, String collegeName) {
//         this.rollNo = rollNo;
//         this.name = name;
//         this.collegeName = collegeName;
//     }
//     void showStudentDetail()
//     {
//         System.out.println("---------------------------------");
//         System.out.println("Roll No : "+rollNo);
//         System.out.println("Name : "+name);
//         System.out.println("college Name : "+collegeName);
//     }    
// }
// public class StaticStudents {
//     public static void main(String[] args) {
        

//         Student sarr[]=new Student[10];

//         for (int i = 0; i < sarr.length; i++) 
//         {
//             sarr[i]=new Student(i+1," Name "+i,"IPEM");
//         }

//         for (int i = 0; i < sarr.length; i++) 
//         {
//             sarr[i].showStudentDetail();
//         }
//     }
// }

// With Static
class Student
{
    int rollNo;
    String name;
    // static String collegeName="IPEM";
    static String collegeName;

    Student(){}
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        collegeName="IPEM";
    }
    static void changeClgName(String clg)
    {
        collegeName=clg;
    }
    void showStudentDetail()
    {
        System.out.println("---------------------------------");
        System.out.println("Roll No : "+rollNo);
        System.out.println("Name : "+name);
        System.out.println("college Name : "+collegeName);
    }    
}
public class StaticStudents {
    public static void main(String[] args) {
        

        Student sarr[]=new Student[10];

        for (int i = 0; i < sarr.length; i++) 
        {
            sarr[i]=new Student(i+1," Name "+i);
        }
        for (int i = 0; i < sarr.length; i++) 
        {
            sarr[i].showStudentDetail();
        }

        Student.changeClgName("IPEM 2.0");

        for (int i = 0; i < sarr.length; i++) 
        {
            sarr[i].showStudentDetail();
        }
    }
}
