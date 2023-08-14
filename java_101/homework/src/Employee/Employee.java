package Employee;

public class Employee {
    String name;
    String surname;

    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, String surname, int salary, int workHours, int hireYear) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        tax();
        bonus();
        raiseSalary();
    }

    void tax() {
        if (!(this.salary < 1000)) {
            this.salary -= this.salary * 3 / 100;
        }
        System.out.println(this.salary);

    }

    void bonus() {
        if (this.workHours > 40) {
            this.salary += (this.workHours - 40) * 30;
        }
        System.out.println(this.salary);

    }

    void raiseSalary() {
        int workYear = 2023 - this.hireYear;
        if (workYear < 10)
            this.salary += this.salary * 5 / 100;
        if (workYear > 9 && workYear < 20)
            this.salary += this.salary * 10 / 100;
        if (workYear > 19)
            this.salary += this.salary * 15 / 100;
        System.out.println(this.salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}
