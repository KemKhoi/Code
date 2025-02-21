public class Main {
    public static void main(String[] args) {
        // Tạo một điểm tại (0,0)
        MyPoint p1 = new MyPoint();
        System.out.println("Point p1: " + p1);

        // Tạo một điểm khác tại (3, 4)
        MyPoint p2 = new MyPoint(3, 4);
        System.out.println("Point p2: " + p2);

        // Kiểm tra phương thức distance()
        System.out.println("Distance from p2 to origin: " + p2.distance());
        System.out.println("Distance from p1 to p2: " + p1.distance(p2));
        System.out.println("Distance from p1 to (5,6): " + p1.distance(5, 6));

        // Kiểm tra setXY và getXY
        p1.setXY(7, 1);
        System.out.println("Updated p1: " + p1);
        int[] coordinates = p1.getXY();
        System.out.println("Coordinates of p1: (" + coordinates[0] + ", " + coordinates[1] + ")");
    }
}