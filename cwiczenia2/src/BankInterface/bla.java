package BankInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class bla {
    public static void main(String[] args) {
        Integer a = 5214;
        Integer b = 5213;
        System.out.println(a.equals(b));
        String password = "37246";
        password = b.toString();
        a = Integer.parseInt(password);
        System.out.println(password.length());
        System.out.println(a);
        System.out.println(a.getClass());
        Set<Point> figures = new LinkedHashSet<>();
        Point p1 = new Point(3, 4);
        Point p2 = new Point(5, 9);
        Point p3 = new Point(6, 8);
        Point p4 = new Point(3, 5);
        figures.add(p1);
        figures.add(p2);
        figures.add(p3);
        figures.add(p4);
        for (Point i : figures) {
            i.print();
        }
    }
}
