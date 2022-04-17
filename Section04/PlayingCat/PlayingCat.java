package Section04.PlayingCat;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean isPlaying = false;
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                isPlaying = true;
            }
        } else {
            if (temperature >= 25 && temperature <= 35) {
                isPlaying = true;
            }
        }
        return isPlaying;
    }
}
