public class MusicApp {

    public static void main(String[] args) {

        PlaylistManager manager = new PlaylistManager();

        try {
            manager.addSong(new Song("S1", "Perfect"));
            manager.addSong(new Song("S2", "Believer"));
            manager.addSong(new Song("S1", "Perfect")); // Duplicate
        } catch (SongAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        manager.viewPlaylist();
        manager.playSong();
        manager.playSong();

        manager.viewRecentlyPlayed();
    }
}
