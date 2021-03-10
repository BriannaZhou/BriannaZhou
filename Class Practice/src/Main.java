public class Main {

    public static void main(String[] args) {

        Student student = new Student("Brian");
        System.out.println(student);
        Courses courses = new Courses("English", 89 );
        System.out.println(courses);
        Courses courses1 = new Courses("Math", 98);
        System.out.println(courses1);
        student.addCourse(courses);
        student.addCourse(courses1);
        System.out.println(student.getAverage());


    }
        }





