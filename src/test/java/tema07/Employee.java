package tema07;

//    4. Creează clasa Employee:
public class Employee {
    //    Atribute: name, salary
    String name;
    double salary;

    //    constructor cu parametri
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //    Metode: increaseSalary(double percent)
    public void increaseSalary(double percent) {
        salary = salary + (salary * percent / 100);
    }

    //    Metode: getSalary()
    public double getSalary() {
        return salary;
    }


    public static void main(String[] args) {
        //    creează 2 angajați
        Employee emp1 = new Employee("Elena", 10000);
        Employee emp2 = new Employee("Roxana", 12000);

        //    crește salariul unuia
        emp1.increaseSalary(5);

        //    afișează rezultatul
        System.out.println(emp1.name + " are salariul " + emp1.getSalary() + " Lei.");
    }
}