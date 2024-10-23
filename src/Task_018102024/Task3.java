package Task_018102024;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value which needs to be converted");
        int num = sc.nextInt();
        System.out.println("Enter type of conversion(1: kilometer to meter, 2: F to c)?");
        int type = sc.nextInt();

        switch (type) {
            case 1:
                System.out.println(num * 1000);
                break;
            case 2:
                System.out.println((num - 32) * 5 / 9);
                break;
        }
    }
}