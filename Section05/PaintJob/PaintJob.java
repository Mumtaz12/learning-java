package Section05.PaintJob;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = (width * height);
        int numberOfBucket = (int) Math.ceil(area / areaPerBucket);
        return numberOfBucket - extraBuckets;

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = (width * height);
        int numberOfBucket = (int) Math.ceil(area / areaPerBucket);
        return numberOfBucket;
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        int numberOfBucket = (int) Math.ceil(area / areaPerBucket);
        return numberOfBucket;
    }
}
