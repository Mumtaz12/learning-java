package Section05.FlourPacker;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        final int BIG_PACK_WEIGHT = 5;

        if (bigCount * BIG_PACK_WEIGHT + smallCount < goal) {
            return false;
        }
        return (goal % BIG_PACK_WEIGHT <= smallCount);
    }
}


// // My first try
// public class FlourPacker {
// public static boolean canPack(int bigCount, int smallCount, int goal) {
// if (bigCount < 0 || smallCount < 0 || goal < 0) {
// return false;
// }

// final int BIG_PACK_WEIGHT = 5;
// final int SMALL_PACK_WEIGHT = 1;

// while (bigCount > 0 && goal / BIG_PACK_WEIGHT > 0) {
// bigCount--;
// goal -= 5;
// }

// while (smallCount > 0 && goal / SMALL_PACK_WEIGHT > 0) {
// smallCount--;
// goal--;
// }

// if (goal == 0) {
// return true;
// }
// return false;

// }
// }