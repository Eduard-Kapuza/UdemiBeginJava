package Lesson7;


public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    String department;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public void zpX2(Lesson5.Employee employee){
        employee.setSalary(employee.getSalary()*2);
    }
}

class EmployeeTest{

    public static void main(String[] args) {

        Lesson5.Employee emp1=new Lesson5.Employee(1, "Petrousow", 28, 5700, "Gos");
        Lesson5.Employee emp2=new Lesson5.Employee(2, "Wolf", 40, 8700, "MWD");
        System.out.println(emp1);
        System.out.println(emp2);
        emp1.zpX2(emp1);
        emp2.zpX2(emp2);
        System.out.println();
        System.out.println(emp1);
        System.out.println(emp2);
    }



}

