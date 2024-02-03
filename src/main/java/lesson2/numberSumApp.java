package lesson2;
 import java.util.Scanner;
  public class numberSumApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 1;
        for (int i = 0; i < 3; i++) {
            int a = num % 10;
            num = num / 10;
            sum = sum * a;
        }
        System.out.println(sum);
    }
}
