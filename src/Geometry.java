public class Geometry {

    public static double AreaTriangle(int length, int height){
        return ((length * height) / 2);
    }

    public static double AreaSquare(int side){
        return (side * side);
    }

    public static double AreaRectangle(int length, int width){
        return (length * width);
    }

    public static double AreaCircle(int radius){
        return (Math.PI * radius * radius);
    }
}
