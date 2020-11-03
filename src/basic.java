public class Basic {
    public static double Addition(double a, double b){
        double sum;
        sum = a + b;
        return sum;
    }

    public static double Subtraction(double a, double b){
        double sum;
        sum = a - b;
        return sum;
    }

    public static double Multiplication(double a, double b){
        double product;
        product = a * b;
        return product;
    }

    public static double Divition(double a, double b){
        double result;
        result = a / b;
        return result;
    }
    
    public static int Factorial(int a){
        int result = 0;
        for(int i = a; i > 0; i--){
            a = (a - 1);
            result = a;
        }
        return result;
    }
}
