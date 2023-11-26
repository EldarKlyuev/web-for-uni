import java.awt.geom.Point2D;

interface Movable {
    void move(double x, double y);
}

interface Resizable {
    void resize(double coefficient);
}

interface Rotatable {
    void rotate(double angle);
}

interface Stateful {
    String getState();
}

class Triangle implements Movable, Resizable, Rotatable, Stateful {
    private Point2D.Double point1;
    private Point2D.Double point2;
    private Point2D.Double point3;

    public Triangle(Point2D.Double point1, Point2D.Double point2, Point2D.Double point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public void move(double x, double y) {
        point1.setLocation(point1.getX() + x, point1.getY() + y);
        point2.setLocation(point2.getX() + x, point2.getY() + y);
        point3.setLocation(point3.getX() + x, point3.getY() + y);
    }

    @Override
    public void resize(double coefficient) {
        double centerX = (point1.getX() + point2.getX() + point3.getX()) / 3;
        double centerY = (point1.getY() + point2.getY() + point3.getY()) / 3;

        point1.setLocation(centerX + (point1.getX() - centerX) * coefficient, centerY + (point1.getY() - centerY) * coefficient);
        point2.setLocation(centerX + (point2.getX() - centerX) * coefficient, centerY + (point2.getY() - centerY) * coefficient);
        point3.setLocation(centerX + (point3.getX() - centerX) * coefficient, centerY + (point3.getY() - centerY) * coefficient);
    }

    @Override
    public void rotate(double angle) {
        double centerX = (point1.getX() + point2.getX() + point3.getX()) / 3;
        double centerY = (point1.getY() + point2.getY() + point3.getY()) / 3;

        double cosAngle = Math.cos(angle);
        double sinAngle = Math.sin(angle);

        double x1 = centerX + (point1.getX() - centerX) * cosAngle - (point1.getY() - centerY) * sinAngle;
        double y1 = centerY + (point1.getX() - centerX) * sinAngle + (point1.getY() - centerY) * cosAngle;
        double x2 = centerX + (point2.getX() - centerX) * cosAngle - (point2.getY() - centerY) * sinAngle;
        double y2 = centerY + (point2.getX() - centerX) * sinAngle + (point2.getY() - centerY) * cosAngle;
        double x3 = centerX + (point3.getX() - centerX) * cosAngle - (point3.getY() - centerY) * sinAngle;
        double y3 = centerY + (point3.getX() - centerX) * sinAngle + (point3.getY() - centerY) * cosAngle;

        point1.setLocation(x1, y1);
        point2.setLocation(x2, y2);
        point3.setLocation(x3, y3);
    }

    @Override
    public String getState() {
        return "Point 1: (" + point1.getX() + ", " + point1.getY() + "), " +
                "Point 2: (" + point2.getX() + ", " + point2.getY() + "), " +
                "Point 3: (" + point3.getX() + ", " + point3.getY() + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Point2D.Double point1 = new Point2D.Double(0, 0);
        Point2D.Double point2 = new Point2D.Double(3, 0);
        Point2D.Double point3 = new Point2D.Double(0, 4);

        Triangle triangle = new Triangle(point1, point2, point3);
        System.out.println("Initial State: " + triangle.getState());

        triangle.move(1, 1);
        System.out.println("After Move: " + triangle.getState());

        triangle.resize(2);
        System.out.println("After Resize: " + triangle.getState());

        triangle.rotate(Math.toRadians(45));
        System.out.println("After Rotate: " + triangle.getState());
    }
}
