public class Runner{
    /*private static String [] firstNames = {"Jack","Jessica","Yussef","Wei","Dea"};
    private static String [] familyNames = {"Bob","Colsen","Ibarra","Chen","Kurti"};
    public static void main(String[] args){
        Teacher teacher = new Teacher("Nathan","Levin","Computer Science","Mr");
        Student [] students;
        students = new Student[5];
        students[0] = new Student(firstNames[0],familyNames[0], 3.6, "Male", 16);
        students[1] = new Student(firstNames[1],familyNames[1], 2.6, "Female", 12);
        students[2] = new Student(firstNames[2],familyNames[2], 4.0, "Male", 17);
        students[3] = new Student(firstNames[3],familyNames[3], 4.0, "Male", 17);
        students[4] = new Student(firstNames[4],familyNames[4], 1.0, "Female", 17);
        Classroom classroom = new Classroom(students,teacher);
    }*/
    static String[] firstNames = {"Jack","Jessica","Yussef","Wei","Dea"};
    static String[] familyNames = {"Bob","Colsen","Ibarra","Chen","Kurti"};
    static double[] GPA = {23,32,45,12,42};
    static int[] age = {1,2,3,4,5};
    static String[] gender = {"male","female","male","female","doge"};

    public static void main(String[] args){
        Person Levin = new Teacher("Nathan","Levin","Computer Science", "Mr.");

        Person[] teachers =  {Levin};
        Person[] students = new Person[firstNames.length];
        for (int i = 0; i < students.length; i++){
            students[i] = new Student(firstNames[i],familyNames[i],GPA[i],gender[i],age[i]);
        }

        for (Person cur : teachers) {
            System.out.println(cur);
            for (Person cur2 : students){
                System.out.println(cur2);
            }
        }
    }
}