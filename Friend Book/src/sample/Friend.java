package sample;

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

    @Override
    public String toString() {
        return name;
    }
}
