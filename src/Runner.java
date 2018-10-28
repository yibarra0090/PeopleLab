public class Runner {
    static String[] firstNames = {"Jack", "Jessica", "Yussef", "Wei", "Dea"};
    static String[] familyNames = {"Bob", "Colsen", "Ibarra", "Chen", "Kurti"};
    static double[] GPA = {3.01, 2.02, 1.03, 4.04, 0.05};
    static int[] age = {13, 52, 63, 124, 25};
    static String[] gender = {"male", "female", "male", "doge", "female"};

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Nathan", "Levin", "Computer Science", "Mr.");
        Student[] students = new Student[firstNames.length];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(firstNames[i], familyNames[i], GPA[i], gender[i], age[i]);
        }
        Classroom classroom = new Classroom(students, teacher);
        classroom.printClass();
        System.out.println("The teacher is " + teacher + ". Their subject is " + teacher.getSubject() + ".");
        System.out.println("The class's average GPA is " + classroom.classAverage());
        System.out.println(Runner.randomstudent());


    }
    public static String randomstudent(){
        String randomFirstName = firstNames[(int) (Math.random() * firstNames.length)];
        String randomFamilyName = familyNames[(int) (Math.random() * familyNames.length)];
        String randomGPA = Double.toString(GPA[(int) (Math.random() * GPA.length)]);
        return ("Random Student "+ randomFirstName + " " + randomFamilyName + " GPA: " + randomGPA);
    }
}



