import java.util.ArrayList;



        public class School {

            ArrayList<Teacher> teachers = new ArrayList<>();

            ArrayList<Student> students = new ArrayList<>();

            private String SchoolName;

            private int NumberOfTeachers;

            private int NumberOfStudents;


            School(String SchoolName, int NumberOfTeachers, int NumberOfStudents) {

                this.SchoolName = SchoolName;

                this.NumberOfTeachers = NumberOfTeachers;

                this.NumberOfStudents = NumberOfStudents;

            }


            public void setSchoolName(String schoolName) {

                SchoolName = schoolName;

            }


            public String getSchoolName() {

                return SchoolName;

            }


            public void setNumberOfTeachers(int numberOfTeachers) {

                NumberOfTeachers = numberOfTeachers;

            }


            public int getNumberOfTeachers() {

                return NumberOfTeachers;

            }


            public void setNumberOfStudents(int numberOfStudents) {

                NumberOfStudents = numberOfStudents;

            }


            public int getNumberOfStudents() {

                return NumberOfStudents;

            }


            //Add teachers to the list
            public void addTeacher(String FirstName, String LastName, String Subject) {

                teachers.add(new Teacher(FirstName, LastName, Subject));

            }


            //delete teacher from the list
            public void deleteTeacher(String FirstName, String LastName, String Subject) {

                for (int i = 0; i < teachers.size(); i++) {
                    if (teachers.get(i).getFirstName() == FirstName && teachers.get(i).getLastName() == LastName
                            && teachers.get(i).getSubject() == Subject) {
                        teachers.remove(i);
                    }
                }
            }

            //show teacher list
            public String showTeacher(){

                String ListOfTeachers = " ";
                for (int i = 0; i < teachers.size(); i++) {
                    ListOfTeachers += "Name: " + teachers.get(i).getFirstName() + " "
                            + teachers.get(i).getLastName() + " " + "\nSubject: " + teachers.get(i).getSubject() + "\n";
                }
                return ListOfTeachers;
            }

            //add student to the list
            public void addStudent(String FirstName, String LastName, int Grade) {
                students.add(new Student(FirstName, LastName, Grade));

            }

            //delete student from the list
            public void deleteStudent(String FirstName, String LastName, int Grade) {

                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getFirstName() == FirstName && students.get(i).getLastName() == LastName
                    && students.get(i).getGrade() == Grade) {
                        students.remove(i);
                    }
                }
            }

            //show student list
            public String showStudent(){

                String ListOfStudents = " ";
                for (int i = 0; i < students.size(); i++) {
                    ListOfStudents += "Name: " + students.get(i).getFirstName() + " " + students.get(i).getLastName()
                            + " " + "\nGrade: " + students.get(i).getGrade() + "\n";
                }
                return ListOfStudents;
            }


            public String toString() {

                return "School: \nName: " + SchoolName + "\nNumber of Teachers: " + NumberOfTeachers

                        + "\nNumber of Students: " + NumberOfStudents;
            }

        }