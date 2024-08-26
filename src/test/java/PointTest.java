import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void testDistanceTo() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        assertEquals(5.0, p1.distanceTo(p2), 0.001);
    }
}