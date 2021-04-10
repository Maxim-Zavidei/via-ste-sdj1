public class Cd {

    private String title;
    private String artist;
    private Song[] playlist;

    public Cd(String title, String artist, Song[] songs) {
        this.title = title;
        this.artist = artist;
        this.playlist = songs;
    }

    public Cd(String title, Song[] songs) {
        this(title, "Various artists", songs);
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Song getSong(int index) {
        return playlist[index];
    }

    public int getNumberOfSongs() {
        return playlist.length;
    }

    public Time getTotalLength() {
        int totalSecond = 0;
        for (Song song : playlist) totalSecond += song.getLength().getTimeInSeconds();
        return new Time(totalSecond);
    }

    public int getNumberOfSongsByArtist(String artist) {
        int counter = 0;
        for (Song song : playlist) if (song.getArtist().equals(artist)) counter++;
        return counter;
    }

    public Song[] getSongsByArtist(String artist) {
        Song[] toReturn = new Song[getNumberOfSongsByArtist(artist)];
        int counter = 0;
        for (Song song : playlist) if (song.getArtist().equals(artist)) toReturn[counter++] = song;
        return toReturn;
    }

    public int getLengthInSecondsOfLongestSong() {
        int longestTimeOfSongSoFar = 0;
        for (Song song : playlist) if (song.getLength().getTimeInSeconds() > longestTimeOfSongSoFar) longestTimeOfSongSoFar = song.getLength().getTimeInSeconds();
        return longestTimeOfSongSoFar;
    }

    public int getNumberOfSongsLongerThan(int lengthInSeconds) {
        int counter = 0;
        for (Song song : playlist) if (song.getLength().getTimeInSeconds() > lengthInSeconds) counter++;
        return counter;
    }

    @Override
    public String toString() {
        return "Title= " + title + ", Artist= " + artist + ", Songs=" + playlist;
    }
}
