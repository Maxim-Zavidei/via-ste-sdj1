public class Main {
    public static void main(String[] args) {

        Song songObj = new Song("lol", "lolart", new Time(500));

        System.out.println("getTitle= " + songObj.getTitle());
        System.out.println("getArtist= " + songObj.getArtist());
        System.out.println("getLength= " + songObj.getLength());
        System.out.println(songObj);
    }
}
