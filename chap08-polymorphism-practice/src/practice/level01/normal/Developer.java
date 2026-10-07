package practice.level01.normal;

public class Developer extends Employee {

    private String language;

    public Developer(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public void printInfo() {
        System.out.println("이름: " + getName() + ", 연봉: " + getSalary() + ", 언어: " + language);
    }
}
