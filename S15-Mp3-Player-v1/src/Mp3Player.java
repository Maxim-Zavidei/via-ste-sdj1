import java.util.ArrayList;

public class Mp3Player {

    private ArrayList<Song> songQueue;

    public Mp3Player() {
        songQueue = new ArrayList<>();
    }

    public Time getLength() {
        int totalNumberOfSeconds = 0;
        for (Song song : songQueue) totalNumberOfSeconds += song.getLength().getTimeInSeconds();
        return new Time(totalNumberOfSeconds);
    }

    public Song getSong(int index) {
        return songQueue.get(index);
    }

    public void addSong(Song song) {
        songQueue.add(song);
    }

    public int getNumberOfSongs() {
        return songQueue.size();
    }

    @Override
    public String toString() {
        return songQueue.toString();
    }
}
