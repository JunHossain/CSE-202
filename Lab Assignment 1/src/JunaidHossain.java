import java.util.Scanner;

public class JunaidHossain {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        var math = new Math();
        math.addition(num1, num2);
        math.subtraction(num1, num2);
        math.multiplication(num1, num2);
        math.division(num1, num2);

        var oddEven = new OddEven();
        oddEven.isOddOrEven(num1);

        var prime = new Prime();
        if (prime.isPrime(num2)) {
            System.out.println("The second number is prime.");
        } else {
            System.out.println("The second number is not prime");
        }

        var equation = new Equation();
        equation.areaOfNonCircle(num1, num2);
    }
}