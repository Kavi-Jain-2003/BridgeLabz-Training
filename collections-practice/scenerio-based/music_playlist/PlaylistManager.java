import java.util.*;

public class PlaylistManager {

    private LinkedList<Song> playlist = new LinkedList<>();
    private Stack<Song> recentlyPlayed = new Stack<>();
    private Set<Song> songSet = new HashSet<>();

    // Add song
    public void addSong(Song song) throws SongAlreadyExistsException {
        if (songSet.contains(song)) {
            throw new SongAlreadyExistsException("Song already exists in playlist");
        }
        playlist.add(song);
        songSet.add(song);
    }

    // Play song
    public void playSong() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty");
            return;
        }
        Song song = playlist.getFirst();
        recentlyPlayed.push(song);
        System.out.println("Playing: " + song);
    }

    // Remove song
    public void removeSong(Song song) {
        playlist.remove(song);
        songSet.remove(song);
    }

    // View playlist
    public void viewPlaylist() {
        System.out.println("Playlist:");
        for (Song song : playlist) {
            System.out.println(song);
        }
    }

    // View recently played
    public void viewRecentlyPlayed() {
        System.out.println("Recently Played:");
        for (Song song : recentlyPlayed) {
            System.out.println(song);
        }
    }
}
