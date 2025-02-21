public class Main {
    public static void main(String[] args) {

        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        MyLine line1 = new MyLine(p1, p2);
        System.out.println("Line 1: " + line1);

        System.out.println("Length of line1: " + line1.getLength());

        System.out.println("Gradient of line1 (radians): " + line1.getGradient());
        MyLine line2 = new MyLine(2, 3, 5, 7);
        System.out.println("Line 2: " + line2);

        line2.setBeginXY(0, 0);
        System.out.println("Updated Line 2: " + line2);
        System.out.println("New length of line2: " + line2.getLength());
    }
}