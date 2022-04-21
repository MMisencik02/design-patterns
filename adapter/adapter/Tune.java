package adapter;

/**
 * A tune, a type of song.
 * This interface is used to treat oldies like tracks.
 * @author Mario Misencik
 */
public interface Tune {
    public String getArtistName();
    public String getDisplayTitle();
    public String getCategory();
}
