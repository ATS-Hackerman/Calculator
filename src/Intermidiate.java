import static java.lang.Math.sqrt;

public class Intermidiate {

    public static int Factorial(int a){
        int result = 1;
        for(int i = 1; i <= a; i++){
            result = result * i;
        }
        return result;
    }

    public static double Pythagorian(int legA, int legB){
        double hypotenuse;
        hypotenuse = sqrt((legA * legA) + (legB * legB));
        return hypotenuse;
    }
}
