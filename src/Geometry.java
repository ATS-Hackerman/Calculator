public class Geometry {

    public static double AreaTriangle(int length, int height){
        return ((length * height) / 2);
    }

    public static double AreaSquare(int edge){
        return (edge * edge);
    }

    public static double AreaRectangle(int length, int width){
        return (length * width);
    }

    public static double AreaCircle(int radius){
        return (Math.PI * radius * radius);
    }

    public static double VolumeTetrahedron(int edge){
        return (Math.pow(edge, 3) / (6 * Math.sqrt(2)));
    }

    public static double VolumeCube(int edge){
        return Math.pow(edge, 3);
    }

    public static double VolumeSphere(int radius){
        return ((4 * Math.PI * Math.pow(radius, 3)) / 3);
    }
}
