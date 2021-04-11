public class Car {

    private String registrationNumber;
    private int mileage;
    private ServiceBook serviceBook;

    public Car(String registrationNumber, int mileage) {
        setRegistrationNumber(registrationNumber);
        this.mileage = mileage;
        this.serviceBook = new ServiceBook();
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getMileage() {
        return mileage;
    }

    public ServiceBook getServiceBook() {
        return serviceBook;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void drive(int mileage) {
        this.mileage += mileage;
    }

    public void service() {
        serviceBook.addService(new Service(mileage, new Date()));
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Car)) return false;
        Car other = (Car) obj;
        return registrationNumber.equals(other.registrationNumber) && mileage == other.mileage && serviceBook.equals(other.serviceBook);
    }

    @Override
    public String toString() {
        return "Car{registrationNumber= " + registrationNumber + ", mileage= " + mileage + " serviceBook= " + serviceBook + "}";
    }
}
