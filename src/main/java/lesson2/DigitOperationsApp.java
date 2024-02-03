package lesson2;
 import java.util.Scanner;
  public class DigitOperationsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        int sum = 0;
        int prod = 1;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            count++;
            sum += rem;
            prod *= rem;
        }
        System.out.printf("Count of digits is:%d\n", count);
        System.out.printf("Sum of digits is:%d\n", sum);
        System.out.printf("Prod of digits is:%d\n", prod);
    }
}
