package practice.level01.normal;

public class Application01 {

    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        employees[0] = new Employee("김직원", 5000);
        employees[1] = new Manager("박매니저", 7000, "인사부");
        employees[2] = new Developer("이개발자", 6000, "Java");

        for (Employee employee : employees) {
            employee.printInfo();
        }
    }
}
