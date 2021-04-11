public abstract class Home {

    private String address;

    public Home(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return "Home{" + "address='" + address + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Home)) return false;
        Home other = (Home) obj;
        return address.equals(other.address);
    }
}
