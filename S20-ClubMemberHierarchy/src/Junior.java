public class Junior extends ClubMember {

    private char gender;

    public Junior(String name, int age, char gender) {
        super(name, age);
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return super.toString() + "->Junior{" + "gender=" + gender + '}';
    }

    public double getMembershipFee() {
        return gender == 'm' || gender == 'M' ? 400 : 300;
    }
}
