public class Teacher{



        private String FirstName;

        private String LastName;

        private String Subject;





        Teacher(String FirstName, String LastName, String Subject){

        this.FirstName = FirstName;

        this.LastName = LastName;

        this.Subject = Subject;

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



    public void setSubject(String subject){

        Subject=subject;

    }



    public String getSubject(){

        return Subject;

    }



    public String toString(){

        return "Teacher: \nName: "+ FirstName + " " + LastName + "\nSubject: " + Subject;

    }



}

