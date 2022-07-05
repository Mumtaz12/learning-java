package Section08.Playlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlbumTest {

    @Test
    public void addSongToPlaylist() {

        Album album = new Album("Song of Mars", "Billy Blaze");
        assertEquals(true, album.addSong("Star Dust", 12.0));
    }

    @Test
    public void addDuplicateToPlaylistFails() {
        Album album = new Album("Song of Mars", "Billy Blaze");
        assertEquals(true, album.addSong("Star Dust", 12.0));
        assertEquals(false, album.addSong("Star Dust", 12.0));
    }
}
