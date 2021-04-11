public class Main {
    public static void main(String[] args) {

        ClubMember[] clubMembers = new ClubMember[] {
            new Junior("lol", 5, 'f'),
            new Senior("lol2", 40),
            new OldBoys("lol5", 8, 10)
        };

        for (ClubMember clubMember : clubMembers) System.out.println(clubMember + ", fee= " + clubMember.getMembershipFee());
    }
}
