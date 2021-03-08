public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee(116888, "Brian", "Zou", 6888);
        System.out.println(employee1);
        employee1.setRaiseSalary(6);
        System.out.println("Annual Salary: " + employee1.getAnnualSalary());
        System.out.println("Raise Salary by 6%: " + employee1.getRaiseSalary());

    }
}
