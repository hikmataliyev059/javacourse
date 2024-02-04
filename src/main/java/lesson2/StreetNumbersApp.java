package lesson2;
 import java.util.Scanner;
  public class StreetNumbersApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num1 = scan.nextInt();
        if ((num + num1) % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
