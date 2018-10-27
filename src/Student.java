public class Student extends Person {
    private double GPA;
    private double height;
    private int age;
    public Student(String firstName, String familyName, double height, int age){
        super(firstName, familyName);
        this.GPA = GPA;
        this.height = height;
        this.age = age;
    }
    public double getGPA(){
        return GPA;
    }
    public double getHeight(){
        return height;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return this.getFirstName() + ", " + this.getFamilyName();
    }

}

