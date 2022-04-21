package adapter;

/**
 * A song. This is an abstract class; the two types that can be created from it are tracks and tunes.
 */
public abstract class Song {
    public abstract String getTitle();
    public abstract String getAlbum();
    public abstract String getArtistFirstName();
    public abstract String getArtistLastName();
    public abstract String getGenre();

    /**
     * Returns the song's title, album, artist name (first and last), and genre in a string format.
     * @return The song's title, album, artist and genre.
     */
    public String toString() {
        return getTitle() + "\nAlbum: " + 
        getAlbum() + "\nBy: " + getArtistFirstName() + " " + 
        getArtistLastName() + "\nGenre: " + getGenre() + "\n";
    }
}
