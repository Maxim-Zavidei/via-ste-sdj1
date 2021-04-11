public class Guest {

    private String name;
    private long phone;

    public Guest(String name, long phone) {
        if (name == null) throw new IllegalArgumentException("Null name.");
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public long getPhone() {
        return this.phone;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Guest)) return false;
        Guest other = (Guest) obj;
        return name.equals(other.name) && phone == other.phone;
    }

    @Override
    public String toString() {
        return name + ", " + phone;
    }
}
