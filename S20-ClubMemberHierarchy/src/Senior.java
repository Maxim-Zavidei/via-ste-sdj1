public class Senior extends ClubMember {

    public Senior(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString() + "->Senior";
    }

    public double getMembershipFee() {
        return 10 * (100 - super.getAge());
    }
}
