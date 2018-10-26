public class Teacher extends Person {
    private String Subject;
    private String Title;
    public Teacher(String Subject, String Title){
        super(Teacher);
        this.Subject = Subject;
        this.Title = Title;
    }
    public String getSubject(){
        return Subject;
    }
    public String toString(){
        return Title+""+"."+" "+FamilyName;
    }

}
