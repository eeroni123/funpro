import org.junit.Test;
import java.util.*;
import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

public class teht1 {

    public static void main(String[] args) {
        List<Point> points = Arrays.asList(new Point(12, 2));
        points.stream().map(p -> p.getX()).forEach(System.out::println);
    }

    private static class Point{
        private int x;
        private int y;

        private Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public Point moveRightBy(int x) {
            return new Point(this.x + x, this.y);
        }

        public static List<Point> moveAllPointsRightBy(List<Point> points, int x) {
            return points.stream()
                    .map(p -> p.moveRightBy(x))
                    .collect(toList());
        }

    }

    @Test
    public void testmoveAllPointsRightBy() {
        List<Point> points = Arrays.asList(new
                Point(12,2), new Point(10,5));
        List<Point> expectedPoints =
                Arrays.asList(new Point(22,2),
                        new Point(20,5));
        List<Point> newPoints = Point.moveAllPointsRightBy(points, 10);
        List <Integer> expectedPointsX = expectedPoints.stream()
                .map(p -> p.getX())
                .collect(toList());

        List <Integer> newPointsX = newPoints.stream()
                .map(p -> p.getX())
                .collect(toList());

        System.out.println(expectedPointsX);
        System.out.println(newPointsX);
        assertEquals(expectedPointsX,newPointsX);
    }
}
