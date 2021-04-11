public class Service {

    private int mileage;
    private Date date;

    public Service(int mileage, Date date) {
        this.mileage = mileage;
        this.date = date.copy();
    }

    public int getMileage() {
        return mileage;
    }

    public Date getDate() {
        return date.copy();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Service)) return false;
        Service other = (Service) obj;
        return mileage == other.mileage && date.equals(other.date);
    }

    @Override
    public String toString() {
        return "{mileage= " + mileage + ", date= " + date + "}";
    }
}
