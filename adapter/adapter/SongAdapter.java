package adapter;

/**
 * An adapter for tunes.
 * @author Mario Misencik
 */
public class SongAdapter extends Song {
    private Tune tune;

    /**
     * An adapter for tunes. 
     * It allows tunes to be treated in the same way as tracks by implementing their getters.
     * @param tune The tune to be adapted.
     */
    public SongAdapter(Tune tune) {
        this.tune = tune;
    }

    /**
     * Returns the tune's title.
     * Since the tune's getDisplayTitle method returns the title AND the record, 
     * the string is split into a string array. The first item is returned.
     * @return The tune's title.
     */
    @Override
    public String getTitle() {
        String[] ret = tune.getDisplayTitle().split(" : ");
        return ret[0];
    }

    /**
     * Returns the tune's album.
     * Since the tune's getDisplayTitle method returns the title AND the album/record, 
     * the string is split into a string array. The second item is returned.
     * @return The tune's album.
     */
    @Override
    public String getAlbum() {
        String[] ret = tune.getDisplayTitle().split(" : ");
        return ret[1];
    }

    /**
     * Returns the first name of the tune's artist.
     * Since the tune's getArtistName method only returns one string,
     * it is split into a string array based on its spaces. The first item is returned.
     * @return The tune's artist's first name.
     */
    @Override
    public String getArtistFirstName() {
        String[] ret = tune.getArtistName().split("\s");
        return ret[0];
    }

    /**
     * Returns the last name of the tune's artist.
     * Since the tune's getArtistName method only returns one string,
     * it is split into a string array based on its spaces.
     * Because multiple spaces can be in an oldie's artist's name,
     * every item from this array except the first is returned.
     * @return The tune's artist's last name.
     */
    @Override
    public String getArtistLastName() {
        String[] ret = tune.getArtistName().split("\s");
        String re = "";
        for (int i = 1; i < ret.length; i++) {
            re = re + ret[i] + " ";
        }
        return re;
    }

    /**
     * Returns the genre of the tune, represented in a String.
     * It is put into the appropriate genre based on its category.
     * @return The tune's genre, based on its category.
     */
    @Override
    public String getGenre() {
        String category = tune.getCategory();
        if (category.equals("Country and Western")) {
            return "Country";
        }
        if (category.equals("R&B and Soul")) {
            return "Other";
        }
        if (category.equals("Easy Listening")) {
            return "Pop";
        }
        if (category.equals("Rock")) {
            return "Rock";
        }
        if (category.equals("Classic Rock")) {
            return "Rock";
        }
        return null;
    }

}