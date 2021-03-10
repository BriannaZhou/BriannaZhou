import java.util.ArrayList;

public class Student {

    private String StudentName;
    private static int StudentID = 0;
    private int id;
    private ArrayList<Courses> course;
    private double Average;


    Student(String StudentName) {
        this.StudentName = StudentName;
        id = StudentID;
        StudentID++;
        course = new ArrayList<>();
        System.out.println("Student object created");

    }
        public void addCourse(Courses courses){



        this.course.add(courses);

        }

        public ArrayList<Courses> getCourse() {

        return course;
    }

    public static int getStudentID () {

        return StudentID;
    }
        public double getAverage(){

        double total = 0;
        double Average = 0;

            for (int i = 0; i < course.size(); i++) {
                total = total + course.get(i).getStudentGrade();

            }
            Average = total/ course.size();
            return Average;
        }


        public String toString () {
        return "Student: \nName: " + StudentName + "\nStudent ID: " + StudentID;
    }

    }
