package adapter;

/**
 * A type of tune, an old song.
 * @author Mario Misencik
 */
public class Oldie implements Tune {
    private String artistName;
    private String songTitle;
    private String recordTitle;
    private String category;

    /**
     * An old song. This does not have quite the same implementation as a track.
     * @param artistName The name of the song's artist.
     * @param songTitle The name of the song.
     * @param recordTitle The name of the record that the song appears on.
     * @param category The category, or genre, of the song.
     */
    public Oldie(String artistName, String songTitle, String recordTitle, String category) {
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
    }

    /**
     * Retrieves the name of the oldie's artist.
     * @return The name of the oldie's artist.
     */
    @Override
    public String getArtistName() {
        return artistName;
    }

    /**
     * Retrieves the name of the oldie and the record it appears on.
     * @return The name of the oldie and its record, in the form "songTitle : recordTitle".
     */
    @Override
    public String getDisplayTitle() {
        return songTitle + " : " + recordTitle;
    }

    /**
     * Retrieves the oldie's category.
     * @return The oldie's category.
     */
    @Override
    public String getCategory() {
        return category;
    }
    
}