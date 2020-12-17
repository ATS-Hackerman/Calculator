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

        if(legA == 0 && legB == 0 && hypotenuse == 0){
            throw new IllegalArgumentException("You can't calculate anything if you have no known variables");
        }

        if(legA == 0 && legB == 0){
            throw new IllegalArgumentException("You can't calculate two unknown legs with only one known hypotenuse!");
        }
        else if(legA == 0 && hypotenuse == 0){
            throw new IllegalArgumentException("You can't calculate an unknown leg and hypotenuse with only one known leg");
        }
        else if(legB == 0 && hypotenuse == 0){
            throw new IllegalArgumentException("You can't calculate an unknown leg and hypotenuse with only one known leg");
        }

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
    public static double Power(double a, double b){
        return (Math.pow(a, b));
    }

    public static String Derivative(int a, int power){
        int numberMult = a * power;
        int numberPow = power - 1;
        return numberMult + "x to the power of " + numberPow;
    }
}
