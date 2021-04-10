public class Main {
    public static void main(String[] args) {

        Mp3Player testPlayer = new Mp3Player();

        testPlayer.addSong(new Song("lol1", "art", new Time(300)));
        testPlayer.addSong(new Song("lol2", "art", new Time(400)));
        testPlayer.addSong(new Song("lol2", "art", new Time(500)));

        System.out.println("getSong= " + testPlayer.getSong(2));
        System.out.println("getNumberOfSongs= " + testPlayer.getNumberOfSongs());
        System.out.println(testPlayer.toString());
    }
}
