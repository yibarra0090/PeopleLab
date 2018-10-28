public class Runner {
    private static String firstNames[] = {"Yussef", "Wei", "Dea","Jack", "Bob", "Emily","Violet", "Nick"};
    private static String familyNames[] = {"Ibarra","Chen", "Kurti","Dylan", "Robert", "Nancy","Red", "Nicke"};
    public static void main(String[] args){
        Teacher teacher = new Teacher("Nathan","Levin","Calculus","Mr");
        Student[] students = new Student[34];
     for(int i = 0; i < 34; i++){
         students[i] = randomStudent();
     }
    }
}
