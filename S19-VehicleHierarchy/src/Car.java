public class Car extends Vehicle {

    private String regNo;

    public Car(String theOwner, double thePrice, String regNo) {
        super(theOwner, thePrice);
        setRegistrationNumber(regNo);
    }

    public String getRegistrationNumber() {
        return regNo;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.regNo = registrationNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "->Car:{regNo=" + regNo + "}";
    }

    @Override
    public boolean equals(Object arg) {
        if (!(arg instanceof Car)) return false;
        Car other = (Car) arg;
        return super.equals(arg) && regNo.equals(other.regNo);
    }
}
