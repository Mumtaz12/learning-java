package Section04.PlayingCat;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayingCatTest {
    @Test
    public void testIsPlayingAt10Summer() {
        assertEquals(false, PlayingCat.isCatPlaying(true, 10));
    }
    @Test
    public void testIsPlayingAt36NotSummer() {
        assertEquals(false, PlayingCat.isCatPlaying(false, 36));
    }
    @Test
    public void testIsPlayingAt35NotSummer() {
        assertEquals(true, PlayingCat.isCatPlaying(false, 35));
    }
}
