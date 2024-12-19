
public class Main {
    public static void main(String[] args) {

        Artist artist1 = new Artist("Taylor Swift", "Pop", 200);
        Artist artist2 = new Artist("Ed Sheeran", "Pop/Folk", 150);


        artist1.displayArtistInfo();
        artist2.displayArtistInfo();


        Song song1 = new Song("Love Story", 240, artist1.getName());
        Song song2 = new Song("Shape of You", 260, artist2.getName());
        Song song3 = new Song("Bad Blood", 220, artist1.getName());


        song1.displaySongInfo();
        song2.displaySongInfo();
        song3.displaySongInfo();


        Playlist playlist = new Playlist("My Favorites");
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);


        playlist.displayPlaylistInfo();


        if (song1.getDuration() > song2.getDuration()) {
            System.out.println(song1.getTitle() + " is longer than " + song2.getTitle());
        } else {
            System.out.println(song2.getTitle() + " is longer than " + song1.getTitle());
        }
    }
}
