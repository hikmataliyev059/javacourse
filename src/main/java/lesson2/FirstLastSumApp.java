package lesson2;
 import java.util.Scanner;
  public class FirstLastSumApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int first = num / 1000;
        int last = num % 10;
        System.out.println(first + last);
    }
}
