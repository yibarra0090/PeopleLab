public class Runner {
    static String[] firstNames = {"Jack", "Jessica", "Yussef", "Wei", "Dea"};  //data lists given
    static String[] familyNames = {"Bob", "Colsen", "Ibarra", "Chen", "Kurti"};
    static double[] GPA = {3.01, 2.02, 1.03, 4.04, 0.05};
    static int[] age = {13, 52, 63, 124, 25};
    static String[] gender = {"male", "female", "male", "doge", "female"};

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Nathan", "Levin", "Computer Science", "Mr."); //creating a new variable with the data type Teacher
        Student[] students = new Student[firstNames.length]; //creating a new array with the data type Student.

        for (int i = 0; i < students.length; i++) { //create Student variable for each index in the data lists and input the variables into the Student[] created.
            students[i] = new Student(firstNames[i], familyNames[i], GPA[i], gender[i], age[i]);
        }

        Classroom classroom = new Classroom(students, teacher); //creating new classroom with the students array and teacher.

        classroom.printClass();
        System.out.println("The teacher is " + teacher + ". Their subject is " + teacher.getSubject() + ".");
        System.out.println("The class's average GPA is " + classroom.classAverage());

        System.out.println(Runner.randomstudent());


    }
    public static String randomstudent(){ //making a new student with random first name, last name, and gpa from the given list of data.
        String randomFirstName = firstNames[(int) (Math.random() * firstNames.length)];
        String randomFamilyName = familyNames[(int) (Math.random() * familyNames.length)];
        String randomGPA = Double.toString(GPA[(int) (Math.random() * GPA.length)]);
        return ("Random Student "+ randomFirstName + " " + randomFamilyName + " GPA: " + randomGPA);
    }
}



