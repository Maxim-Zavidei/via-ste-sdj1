public class Main {
    public static void main(String[] args) {

        Song[] playlist = new Song[] {new Song("lol1", "art", new Time(500)), new Song("lol2", "art", new Time(700)), new Song("lol3", "art", new Time(800))};

        Cd testCd = new Cd("gg", "soo", playlist);

        System.out.println("getTotalLength= " + testCd.getTotalLength());
        System.out.println("getNumberOfSongsByArtist= " + testCd.getNumberOfSongsByArtist("art"));
        System.out.println("getSongsByArtist= " + testCd.getSongsByArtist("art"));
        System.out.println("getLengthOfInSecondsOfLongestSong= " + testCd.getLengthInSecondsOfLongestSong());
        System.out.println("getNumberOfSongsLongerThan= " + testCd.getNumberOfSongsLongerThan(400));
    }
}
