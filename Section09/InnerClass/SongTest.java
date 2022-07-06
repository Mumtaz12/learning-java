package Section09.InnerClass;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SongTest {

    @Test
    public void createSong() {
        Song song = new Song("Hello There", 40);

        String message = song.toString();

        assertEquals("Hello There", song.getTitle());
        assertEquals(message, "Hello There: 40.0");
    }
}
