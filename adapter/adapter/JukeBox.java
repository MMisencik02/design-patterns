package adapter;

import java.util.HashMap;

/**
 * A jukebox that plays songs.
 * @author Mario Misencik
 */
public class JukeBox {
    private HashMap<String, Song> songs;
    private int currentSong;

    /**
     * A jukebox that plays songs.
     */
    public JukeBox() {
        songs = new HashMap<String, Song>();
    }

    /**
     * Adds a song to the jukebox's collection.
     * @param song The song to be added to the jukebox.
     */
    public void addSong(Song song) {
        songs.put(song.getTitle(), song);
    }

    /**
     * "Plays" one of the jukebox's songs.
     * More specifically, it calls the song's toString method.
     * @param songName The name of the song. 
     * This is used to fetch the song from the jukebox's song list.
     */
    public void play(String songName) {
        if (songs.get(songName) != null) {
            currentSong++;
            System.out.println(songs.get(songName).toString());
        } else {
            System.out.println("Sorry, that song is not in the jukebox.");
        }
    }
}