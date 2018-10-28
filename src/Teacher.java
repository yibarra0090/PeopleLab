public class Teacher extends Person {
    private String Subject;
    private String Title;
    public Teacher(String firstName, String familyName, String Subject, String Title){
        super(firstName, familyName);
        this.Subject = Subject;
        this.Title = Title;
    }
    public String getSubject(){
        return (Subject);
    }
    public String toString(){
        return (Title + " " + getFamilyName());
    }
}
