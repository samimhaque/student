package ie.gmit;

public class student {
   private String studentName=null;
    private String studentEmail=null;

    public student(String sEmail,String sName){
        studentName = sName;
        studentEmail= sEmail;

    }
    public static void main(String[] args) {
        student student = new student("cbarry@gmail.com", "Chris Barry" );
        student student1 = new student("mscott@gmit.ie","Murry Scott");

    }
}


