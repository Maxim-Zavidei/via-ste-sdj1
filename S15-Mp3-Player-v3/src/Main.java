public class Main {
    public static void main(String[] args) {

        Mp3Player testPlayer = new Mp3Player(new Time(700));

        testPlayer.addSong(new Song("lol1", "art", new Time(300)));
        testPlayer.addSong(new Song("lol2", "art", new Time(400)));
        testPlayer.addSong(new Song("lol2", "art", new Time(500)));

        System.out.println("getSong= " + testPlayer.getSong(1));
        System.out.println("getNumberOfSongs= " + testPlayer.getNumberOfSongs());
        System.out.println(testPlayer.toString());
        System.out.println("getNumberOfSongsLongerThan= " + testPlayer.getNumberOfSongsLongerThan(new Time(350)));
        System.out.println("getSongsLongerThan= " + testPlayer.getSongsLongerThan(new Time(350)));
    }
}
