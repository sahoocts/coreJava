package Java8.Employeee;

public class Employee {

    private int id;
    private int deptId;

    @Override
    public String toString() {
        return "Employee{" +
                "deptId=" + deptId +
                ", salary=" + salary +
                '}';
    }

    private String name;
    private double salary;
    public Employee(int id, int deptId, String name, double salary) {
        this.id = id;
        this.deptId = deptId;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }




}
