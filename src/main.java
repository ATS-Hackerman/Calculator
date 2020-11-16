public class Main {
    public static void main(String[] args){
        System.out.println("20 + 30 = " + Basic.Addition(20,30));
        System.out.println("20 - 30 = " + Basic.Subtraction(20,30));
        System.out.println("20 * 30 = " + Basic.Multiplication(20,30));
        System.out.println("20 / 30 = " + Basic.Divition(30,3));

        System.out.println("4 factorial = " + Intermidiate.Factorial(4));
        System.out.println("The unknown side of the triangle equals: " + Intermidiate.Pythagorian(3, 4, 0));
    }
}
