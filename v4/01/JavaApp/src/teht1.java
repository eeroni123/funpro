import java.util.*;

import static java.util.stream.Collectors.toList;

public class teht1 {



    public static void main(String[] args) {
        List<Point> points = Arrays.asList(new Point(12, 2), null);
        points = Point.moveAllPointsRightBy(points,10);
        points.stream()
                .map(x -> x.getX())
                .forEach(System.out::println);

    }


    private static class Point {
        private static int x;
        private static int y;

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


        public static Point moveRightBy(int amount) {
            return new Point(x + amount, y);
        }

        public static List<Point> moveAllPointsRightBy(List<Point> points, int x) {
            return points.stream()
                    .map(p -> moveRightBy(x))
                    .collect(toList());
        }
    }
}
