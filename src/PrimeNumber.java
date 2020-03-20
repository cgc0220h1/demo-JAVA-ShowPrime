import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of Prime Number you want to show: ");
        int input = scanner.nextInt();
        int count = 0;
        int number = 2;
        boolean isPrime = true;
        boolean isNewLine = false;

        while (count < input) {
            for (int index = 2; index <= Math.sqrt(number); index++) {
                if (number % index == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                count++;
                System.out.print(number + " ");
                if (count % 5 == 0) {
                    isNewLine = true;
                }
            }
            if (isNewLine) {
                System.out.println();
                isNewLine = false;
            }
            number++;
            isPrime = true;
        }
    }
}
