package adapter;

/**
 * A track, a type of song.
 * @author Mario Misencik
 */
public class Track extends Song {
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;

    /**
     * A track, a type of song.
     * @param title The track's title.
     * @param album The track's album.
     * @param firstName The first name of the track's artist.
     * @param lastName The last name of the track's artist.
     * @param genre The track's genre.
     */
    public Track(String title, String album, String firstName, String lastName, Genre genre) {
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }

    /**
     * Retrieves the track's title.
     * @return The track's title.
     */
    @Override
    public String getTitle() {
        return title;
    }

    /**
     * Retrieves the track's album.
     * @return The track's album.
     */
    @Override
    public String getAlbum() {
        return album;
    }

    /**
     * Retrieves the first name of the track's artist.
     * @return The first name of the track's artist.
     */
    @Override
    public String getArtistFirstName() {
        return firstName;
    }

    /**
     * Retrieves the last name of the track's artist.
     * @return The last name of the track's artist.
     */
    @Override
    public String getArtistLastName() {
        return lastName;
    }

    /**
     * Retrieves the track's genre in the form of a string.
     * @return The track's genre.
     */
    @Override
    public String getGenre() {
        if (genre.name().equals("ROCK")) {
            return "Rock";
        }
        if (genre.name().equals("POP")) {
            return "Pop";
        }
        if (genre.name().equals("HIPHOP")) {
            return "Hiphop";
        }
        if (genre.name().equals("JAZZ")) {
            return "Jazz";
        }
        if (genre.name().equals("COUNTRY")) {
            return "Country";
        }
        if (genre.name().equals("OTHER")) {
            return "Other";
        }
        return null;
    }
    
}