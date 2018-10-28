public class Classroom {
    private Student[] students; //field
    private Teacher teacher;

    public Classroom (Student[] students, Teacher teacher){ //constructor
        this.teacher = teacher;
        this.students = students;
    }

    public String getSubject(){
        return this.teacher.getSubject();
    }

    public double classAverage(){ //add all student GPA and divide by the number of students.
        double sum = 0;
        for (Student s : students){
            sum += s.getGPA();
        }
        return sum/ students.length;
    }
    public void printClass(){ //print data.
        System.out.println(teacher.toString());
        System.out.println(teacher.getSubject());
        for (Student s : students){
            System.out.println(s.toString()+"\n"+ "Their GPA is:" +s.getGPA() +"\n"+" Gender:"+s.getGender()+"\n"+" Age:"+s.getAge());
        }
    }
}