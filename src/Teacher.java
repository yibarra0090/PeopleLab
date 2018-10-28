public class Teacher extends Person {
    private String Subject; // field
    private String Title;

    public Teacher(String firstName, String familyName, String Subject, String Title){ //constructor
        super(firstName, familyName);
        this.Subject = Subject;
        this.Title = Title;
    }

    public String getSubject(){
        return (Subject);
    }
    public String toString(){ //overrides
        return (Title + " " + getFamilyName());
    }
}
