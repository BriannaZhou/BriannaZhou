package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Friend {
    private String name;
    private String school;
    private int grade;

    public int getGrade() {
        return grade;
    }

    public String getSchool() {
        return school;
    }

    public String getName() {
        return name;
    }

    public Friend(String name, String school, int grade){
        this.name = name;
        this.school = school;
        this.grade = grade;
    }

    public void writeToFile()throws IOException{
        FileWriter fw = new FileWriter("Friends.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name + ",\n");
        bw.write(school + ",\n");
        bw.write(Integer.toString(grade) + "\n");
        bw.write(";\n");
        bw.close();

    }

    @Override
    public String toString() {
        return name;
    }
}
