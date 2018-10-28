public class Student extends Person {
    private double GPA; //field
    private String gender;
    private int age;

    public Student(String firstName, String familyName, double GPA, String gender, int age){ //constructor
        super(firstName, familyName);
        this.GPA = GPA;
        this.gender = gender;
        this.age = age;
    }

    public double getGPA(){
        return GPA;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public String toString(){ //overrides
        return this.getFirstName() + ", " + this.getFamilyName();
    }

}

