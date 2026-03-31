public class Song {
    private String songId;
    private String title;

    public Song(String songId, String title) {
        this.songId = songId;
        this.title = title;
    }

    public String getSongId() {
        return songId;
    }

    @Override
    public String toString() {
        return songId + " - " + title;
    }

    // Needed for Set duplicate checking
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Song)) return false;
        Song song = (Song) obj;
        return songId.equals(song.songId);
    }

    @Override
    public int hashCode() {
        return songId.hashCode();
    }
}
