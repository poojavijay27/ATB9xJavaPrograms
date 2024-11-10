package Task_18102024;

import java.util.Scanner;

public class Task_29102024 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for( int i = n ;i >= 0 ;i--)

        {
            for(int j =0 ; j < i; j++) //only for printing number of stars
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }




    }
}
