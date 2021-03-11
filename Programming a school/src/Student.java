
import java.util.ArrayList;



     public class Student{



        private String FirstName;

        private String LastName;

        private int Grade;

        private static int StudentNumber=0;

        private int ID;





        Student(String FirstName,String LastName,int Grade){

            this.FirstName=FirstName;

            this.LastName=LastName;

            this.Grade=Grade;

            ID=StudentNumber;

            StudentNumber++;


        }



        public void setFirstName(String firstName){

            FirstName = firstName;

        }



        public String getFirstName(){

            return FirstName;

        }

        public void setLastName(String lastName){

            LastName = lastName;

        }



        public String getLastName(){

            return LastName;

        }



        public void setGrade(int grade){

            Grade = grade;

        }



        public int getGrade(){

            return Grade;

        }



        public String toString(){

            return "Student:\nName: "+ FirstName+ " "+ LastName + "\nGrade: " + Grade;

        }

    }

