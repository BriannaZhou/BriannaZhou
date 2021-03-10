public class Courses {

    private String SubjectName;
    private int StudentGrade;

    Courses(String SubjectName, int StudentGrade){
       this.StudentGrade = StudentGrade;
       this.SubjectName = SubjectName;
    }

    public void setStudentGrade(int studentGrade) {
        StudentGrade = studentGrade;
    }

    public int getStudentGrade() {
        return StudentGrade;
    }


    public String toString(){
        return "Subject: \nName: " + SubjectName + "\nStudent Grade: " + StudentGrade;
    }
}

