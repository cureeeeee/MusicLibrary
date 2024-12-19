
public class Artist {
    private String name;
    private String genre;
    private int totalSongs;


    public Artist(String name, String genre, int totalSongs) {
        this.name = name;
        this.genre = genre;
        this.totalSongs = totalSongs;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTotalSongs() {
        return totalSongs;
    }

    public void setTotalSongs(int totalSongs) {
        this.totalSongs = totalSongs;
    }


    public void displayArtistInfo() {
        System.out.println("Artist: " + name + " | Genre: " + genre + " | Total Songs: " + totalSongs);
    }
}
