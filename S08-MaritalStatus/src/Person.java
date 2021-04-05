public class Person {

    private String name;
    private String maritalStatus;
    private int numberOfChildren;

    public Person(String name) {
        this.name = name;
        this.maritalStatus = "Single";
        this.numberOfChildren = 0;
    }

    public void setMaritalStatus(String status) {
        switch (status.toLowerCase()) {
        case "single": this.maritalStatus = "Single"; break;
        case "married": this.maritalStatus = "Married"; break;
        case "divorced": this.maritalStatus = "Divorced"; break;
        case "widowed": this.maritalStatus = "Widowed";
        }
    }

    public void addChild() {
        this.numberOfChildren++;
    }

    public boolean isSingle() {
        return this.maritalStatus.equals("Single");
    }

    @Override
    public String toString() {
        return this.name + ", " + this.maritalStatus + ", " + (this.numberOfChildren == 1 ? "1 child" : numberOfChildren + " children");
    }
}
