public class Main {


        public static void main(String[]args){

            School school=new School("Windermere", 45, 2021);
            System.out.println(school);
            System.out.println("----------------------------");

        //Add 10 students to student list

            school.addStudent("Anna","Zhang",88);
            school.addStudent("Anne","Zheng",86);
            school.addStudent("Angela", "Zhen", 78);
            school.addStudent("Anthea", "Zeng", 68);
            school.addStudent("Anthony", "Yan", 89);
            school.addStudent("Aaron", "Zhong", 90);
            school.addStudent("Ben", "Zen", 56);
            school.addStudent("Steven", "Zhou", 67);
            school.addStudent("John", "Zou", 90);
            school.addStudent("Johnny", "Zang", 77);


        //Add 3 teachers to teacher list

            school.addTeacher("Aaron","Zess","Art");
            school.addTeacher("Bob", "Zhen", "Math");
            school.addTeacher("Alex", "Zen", "English");

        //print out teacher list
            System.out.println("Teacher List:");
            System.out.println(school.showTeacher());


            //print out student list
            System.out.println("Student List:");
            System.out.println(school.showStudent());



        //delete two students

            school.deleteStudent("Anna", "Zhang", 88);
            school.deleteStudent("Anthony", "Yan", 89);


        //delete one teacher
            school.deleteTeacher("Bob", "Zhen", "Math");


        //print out student list
            System.out.println("Student List:");
            System.out.println(school.showStudent());

        //print out teacher list
            System.out.println("Teacher List:");
            System.out.println(school.showTeacher());



        }
    }
