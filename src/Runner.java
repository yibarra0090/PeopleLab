public class Runner{
    private static String [] firstNames = {"Jack","Jessica","Yussef","Wei","Dea"};
    private static String [] familyNames = {"Bob","Colsen","Ibarra","Chen","Kurti"};
    public static void main(String[] args){
        Teacher teacher = new Teacher("Nathan","Levin","Computer Science","Mr");
        Student [] student;
        student = new Student[5];
        student[0] = new Student(firstNames[0],familyNames[0], 3.6, "Male", 16);
        student[1] = new Student(firstNames[1],familyNames[1], 2.6, "Female", 12);
        student[2] = new Student(firstNames[2],familyNames[2], 4.0, "Male", 17);
        student[3] = new Student(firstNames[3],familyNames[3], 4.0, "Male", 17);
        student[4] = new Student(firstNames[4],familyNames[4], 1.0, "Female", 17);
        Classroom classroom = new Classroom(student,teacher);
    }
}