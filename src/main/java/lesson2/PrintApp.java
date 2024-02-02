package lesson2;
 import java.util.Scanner;
    public class PrintApp {
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        System.out.println(word);
        System.out.println(word.length());
        System.out.println(word.toUpperCase());
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(word.length()-1));
        System.out.println(word.substring(2,4));
        System.out.println(word.trim());

          Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 1){
            System.out.println("Yanvar");
        } else if (num == 2) {
            System.out.println("Fevral");
        } else if (num == 3) {
            System.out.println("Mart");
        } else if (num == 4) {
            System.out.println("Aprel");
        } else if (num == 5) {
            System.out.println("May");
        } else if (6 == num) {
            System.out.println("Iyun");
        } else if (num == 7) {
            System.out.println("Iyul");
        } else if (num == 8) {
            System.out.println("Avqust");
        } else if (num == 9) {
            System.out.println("Sentybar");
        } else if (num == 10) {
            System.out.println("Oktyabr");
        } else if (num ==11) {
            System.out.println("Noyabr");
        } else if (num == 12) {
            System.out.println("Dekabr");
        } else{
            System.out.println("Bele bir ay yoxdu");
        }

          if (num<=0 || num>=12){
            System.out.println("Bele bir fesil yoxdu");
        } else if (num>=3 && num<=5) {
            System.out.println("Spring");
        } else if (num>=6 && num<=8) {
            System.out.println("Summer");
        } else if (num>=9 && num<=11) {
            System.out.println("Fall");
        }else{
            System.out.println("Winter");
        }
      }
    }

