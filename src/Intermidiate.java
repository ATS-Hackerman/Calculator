import static java.lang.Math.sqrt;

public class Intermidiate {

    public static int Factorial(int a){
        int result = 1;
        for(int i = 1; i <= a; i++){
            result = result * i;
        }
        return result;
    }

    public static double Pythagorian(int legA, int legB, int hypotenuse){
        double result = 0.0;
        if(legA == 0){
            result = sqrt((hypotenuse * hypotenuse) - (legB * legB));
        }
        if(legB == 0){
            result = sqrt((hypotenuse * hypotenuse) - (legA * legA));
        }
        if(hypotenuse == 0){
            result = sqrt((legA * legA) + (legB * legB));
        }
        return result;
    }
}
