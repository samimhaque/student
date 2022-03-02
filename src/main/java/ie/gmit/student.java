package ie.gmit;

public class student {
    private String name;
    private String email;

//Constructors
public student(String name, String email) {
    this.name = name;
    this.email = email;

}

//Get and set methods for all properties

    String getName() {
        return name;
    }
    public void setName(String newName) {

        name = newName;
    }
    String getEmail() {
        return email;
    }
    public void setEmail(String newEmail) {
        email = newEmail;
    }

    public static void main(String[] args) {
        student student = new student("cbarry@gmail.com", "Chris Barry" );
        student student1 = new student("mscott@gmit.ie","Murry Scott");

    }
}


