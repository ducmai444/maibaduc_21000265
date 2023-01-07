package ex1.ex1_3;

public class TestPoint {
    public static void main(String[] args){
        Point2D point2d = new Point2D(1,1);
        System.out.println(point2d);
        point2d.setX(2);
        point2d.setY(2);
        System.out.println(point2d);

        Point3D point3d = new Point3D(1,1,1);
        System.out.println(point3d);
        point3d.setXYZ(2, 2, 4);
        System.out.println(point3d);
    }
}
