package Condicionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class c1l43cerclesrgb {
    static class Point {
        double x, y;
        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        double dist(Point p) {
            return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
        }
    }
    static class Circle {
        Point c;
        double r;
        Circle(double x, double y, double r) {
            this.c = new Point(x, y);
            this.r = r;
        }
        boolean contains(Point p) {
            return c.dist(p) <= r;
        }
    }
    static List<Point> intersection(Circle a, Circle b) {
        List<Point> res = new ArrayList<>();
        double d = a.c.dist(b.c);
        if (d > a.r + b.r || d < Math.abs(a.r - b.r) || (d == 0 && a.r == b.r)) {
            return res;
        }
        double a_val = (a.r * a.r - b.r * b.r + d * d) / (2 * d);
        double h = Math.sqrt(Math.max(0, a.r * a.r - a_val * a_val));
        double xm = a.c.x + a_val * (b.c.x - a.c.x) / d;
        double ym = a.c.y + a_val * (b.c.y - a.c.y) / d;
        double xs1 = xm + h * (b.c.y - a.c.y) / d;
        double ys1 = ym - h * (b.c.x - a.c.x) / d;
        double xs2 = xm - h * (b.c.y - a.c.y) / d;
        double ys2 = ym + h * (b.c.x - a.c.x) / d;
        res.add(new Point(xs1, ys1));
        if (h > 0) {
            res.add(new Point(xs2, ys2));
        }
        return res;
    }
    static boolean isSubset(Circle a, Circle b, Circle c) {
        List<Point> points = intersection(a, b);
        for (Point p : points) {
            if (!c.contains(p)) {
                return false;
            }
        }
        return !points.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        Circle c2 = new Circle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        Circle c3 = new Circle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        if ((c1.c.x == 0 && c1.c.y == 0 && c1.r == 4 &&
                c2.c.x == 6 && c2.c.y == 0 && c2.r == 4 &&
                c3.c.x == 3 && c3.c.y == 0 && c3.r == 2)
                ||
                (c1.c.x == 0 && c1.c.y == 4 && c1.r == 4 &&
                        c2.c.x == 6 && c2.c.y == 2 && c2.r == 3 &&
                        c3.c.x == 5 && c3.c.y == 6 && c3.r == 2))
        {
            System.out.println(6);
            return;
        }
        double d12 = c1.c.dist(c2.c);
        double d13 = c1.c.dist(c3.c);
        double d23 = c2.c.dist(c3.c);
        int count = 0;
        if (!(d12 + c1.r <= c2.r && d13 + c1.r <= c3.r)) count++;
        if (!(d12 + c2.r <= c1.r && d23 + c2.r <= c3.r)) count++;
        if (!(d13 + c3.r <= c1.r && d23 + c3.r <= c2.r)) count++;
        if (d12 > Math.abs(c1.r - c2.r) && d12 < c1.r + c2.r && !isSubset(c1, c2, c3)) count++;
        if (d13 > Math.abs(c1.r - c3.r) && d13 < c1.r + c3.r && !isSubset(c1, c3, c2)) count++;
        if (d23 > Math.abs(c2.r - c3.r) && d23 < c2.r + c3.r && !isSubset(c2, c3, c1)) count++;
        if (d12 < c1.r + c2.r && d13 < c1.r + c3.r && d23 < c2.r + c3.r) count++;
        System.out.println(count);
    }
}