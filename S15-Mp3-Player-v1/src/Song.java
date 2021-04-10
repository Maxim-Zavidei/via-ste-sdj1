public class Song {

    private String title;
    private String artist;
    private Time length;

    public Song(String title, String artist, Time length) {
        this.title = title;
        this.artist = artist;
        this.length = length.copy();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Time getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "title=" + title + ", artist='" + artist + ", length=" + length;
    }
}
