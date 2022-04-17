package Section05.PaintJob;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaintJobTest {
    @Test
    public void testInvalidArguments() {
        assertEquals(-1, PaintJob.getBucketCount(1, 1, 1, -1));
    }

    @Test
    public void test() {
        assertEquals(3, PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
    }

    @Test
    public void test2() {
        assertEquals(5, PaintJob.getBucketCount(3.4, 2.1, 1.5));
    }

    @Test
    public void test3() {
        assertEquals(5, PaintJob.getBucketCount(3.26, 0.75));
    }
}
