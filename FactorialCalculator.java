import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
       int positiveInteger =  getNonNegativeInteger();
       System.out.printf("The factorial of %d is: %d\n", positiveInteger, calculateFactorial(positiveInteger));
    }

    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);

        int nonNegativeInt;
        do {
            System.out.print("Enter a non-negative integer: ");
            nonNegativeInt = scanner.nextInt();
        } while (nonNegativeInt < 0);

        scanner.close();
        return nonNegativeInt;
    }
    public static long calculateFactorial (int n) {
        if (n == 0) return 1;
    
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
}

}