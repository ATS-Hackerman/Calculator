public class Main {
    public static void main(String[] args){
        System.out.println("Basic Examples");
        System.out.println("20 + 30 = " + Basic.Addition(20,30));
        System.out.println("20 - 30 = " + Basic.Subtraction(20,30));
        System.out.println("20 * 30 = " + Basic.Multiplication(20,30));
        System.out.println("20 / 30 = " + Basic.Divition(30,3));

        System.out.println("\n" + "Intermidiate examples");
        System.out.println("4 factorial = " + Intermidiate.Factorial(4));
        System.out.println("The unknown side of the triangle equals: " + Intermidiate.Pythagorian(3, 4, 0));

        System.out.println("\n" + "Geometry examples");
        System.out.println("Area of the triangle: " + Geometry.AreaTriangle(4,3));
        System.out.println("Area of the square: " + Geometry.AreaSquare(4));
        System.out.println("Area of the rectangle: " + Geometry.AreaRectangle(4, 5));
        System.out.println("Area of the circle: " + Geometry.AreaCircle(3));
        System.out.println("Volume of the tetrahedron is: " + Geometry.VolumeTetrahedron(4));
        System.out.println("Volume of the cube is: " + Geometry.VolumeCube(4));
        System.out.println("Volume of the sphere is: " + Geometry.VolumeSphere(3));
    }
}
