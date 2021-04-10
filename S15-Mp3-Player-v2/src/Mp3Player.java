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

    public int getNumberOfSongsLongerThan(Time length) {
        int counter = 0;
        int timeInSeconds = length.getTimeInSeconds();
        for (Song song : songQueue) if (song.getLength().getTimeInSeconds() > timeInSeconds) counter++;
        return counter;
    }

    public Song[] getSongsLongerThan(Time length) {
        Song[] toReturn = new Song[getNumberOfSongsLongerThan(length)];
        int timeInSeconds = length.getTimeInSeconds();
        int counter = 0;
        for (Song song : songQueue) if (song.getLength().getTimeInSeconds() > timeInSeconds) toReturn[counter++] = song;
        return toReturn;
    }
}
