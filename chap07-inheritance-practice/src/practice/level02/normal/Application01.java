package practice.level02.normal;

public class Application01 {

    public static void main(String[] args) {

        Employee employee = new Employee("김직원", 5000);
        employee.printInfo();

        Manager manager = new Manager("박매니저", 7000, "인사부");
        manager.printInfo();

    }

}
