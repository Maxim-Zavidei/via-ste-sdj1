public class OldBoys extends ClubMember {

    private int yearsOfMembership;

    public OldBoys(String name, int age, int yearsOfMembership) {
        super(name, age);
        setYearsOfMembership(yearsOfMembership);
    }

    public int getYearsOfMembership() {
        return yearsOfMembership;
    }

    public void setYearsOfMembership(int yearsOfMembership) {
        this.yearsOfMembership = yearsOfMembership;
    }

    @Override
    public String toString() {
        return super.toString() + "->OldBoys{" + "yearsOfMembership=" + yearsOfMembership + '}';
    }

    public double getMembershipFee() {
        return yearsOfMembership > 9 ? 100 : yearsOfMembership >= 5 ? 200 : 300;
    }
}
