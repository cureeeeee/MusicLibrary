
import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<Song> songs; // List of Song objects
    private int totalDuration; // Total duration in seconds


    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
        this.totalDuration = 0;
    }


    public void addSong(Song song) {
        songs.add(song);
        totalDuration += song.getDuration();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalDuration() {
        return totalDuration;
    }


    public void displayPlaylistInfo() {
        System.out.println("Playlist: " + name);
        for (Song song : songs) {
            song.displaySongInfo();
        }
        System.out.println("Total Duration: " + totalDuration + " sec");
    }
}
