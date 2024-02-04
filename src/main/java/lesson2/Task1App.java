package lesson2;

import java.util.Scanner;

public class Task1App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num>0){
            System.out.println("Positive");
        } else if (num == 0) {
            System.out.println("Zero");
        } else{
            System.out.println("Negative");
        }
    }
}


