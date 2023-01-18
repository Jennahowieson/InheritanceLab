package staff;

public abstract class Employee {

    private String name;
    private int niNumber;
    private double salary;

    public Employee(String name, int niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null){
        this.name = name;
    }}

    public int getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(int niNumber) {
        this.niNumber = niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double raiseSalary(double salaryIncrease) {
        double newSalary;
        if (salaryIncrease > 0) {
            newSalary = (this.salary + salaryIncrease);
            setSalary (newSalary);
        }
        return this.salary;
    }

    public double payBonus(){
        return (this.salary * 0.01);
    }
}
