public class Job {

    private Person employee;
    private String title;
    private double salary;

    public Job(String title, double salary, Person employee) {
        this.title = title;
        this.salary = salary;
        this.employee = employee;
    }

    public Job(String title, double salary) {
        this(title, salary, null);
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }

    public Person getEmployee() {
        return employee;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isAvailable() {
        return employee == null;
    }

    public void hire(Person employee) {
        if (isAvailable()) this.employee = employee;
    }

    public void fire() {
        employee = null;
    }

    @Override
    public String toString() {
        return "Title= " + title + ", Salary= " + salary + ", " + (isAvailable() ? "No employee." : employee);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Job)) return false;
        Job other = (Job) obj;
        return title.equals(other.title) && salary == other.salary && (isAvailable() ? other.isAvailable() : employee.equals(other.employee));
    }
}
