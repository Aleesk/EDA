package guides.guide_03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Distancias {
    static class Point{
        int x;
        int y;

        Point() {
            this.x = (int) (Math.random() * 10);
            this.y = (int) (Math.random() * 10);
        }
    }

    static void printPoints(Point[] points) {
        for (Point point : points) {
            System.out.println(point.x + " " + point.y);
        }
    }

    static int binarySearch(Point[] points, double d) {
        int left = 0;
        int right = points.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            double dist = distance(points[mid]);
            if (dist == d) {
                return mid;
            } else if (dist < d) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
        // 1. El mejor caso es que la distancia buscada sea en el punto medio de el arreglo
        // 2. El peor caso es que no encuentre la distancia en el arreglo
        // 3. La complejidad es O(log(N)) suponiendo que esta ordenada
        // 4. Se deberia redondear las distancias obtenidas como la que se entrega en el parametro.
    }

    static void printPointsDistance(int N, int D) {
        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            points[i] = new Point();
        }
        if (points.length != 0) {
            for (int i = 0; i < N; i++) {
                System.out.println(points[i].x + " " + points[i].y + ": " + Math.abs(D - distance(points[i])));
            }
        } else {
            System.out.println("NO SOLUTION");
        }
    }

    static double distance(Point a) {
        return Math.sqrt(Math.pow(a.x, 2) + Math.pow(a.y, 2));
    }

    public static void main(String[] args) {
//        Point[] points = new Point[4];
//        for (int i = 0; i < points.length; i++) {
//            points[i] = new Point();
//        };
        printPointsDistance(4, 5);
//        System.out.println("arreglo antes de ordenar");
//        printPoints(points);
//        System.out.println("arreglo después de ordenar");
//        // sort points by x
//        // Arrays.sort(points, (a, b) -> (a.x - b.x));
//        // printPoints(points);
//        // sort points by y
//        // Arrays.sort(points, (a, b) -> a.y - b.y);
//        // printPoints(points);
//        // sort points by distance from origin
//        Arrays.sort(points, (a, b) -> {
//            double distanceA = distance(a);
//            double distanceB = distance(b);
//            return Double.compare(distanceA, distanceB);
//        });
        // print points
//        printPoints(points);
    }
}
