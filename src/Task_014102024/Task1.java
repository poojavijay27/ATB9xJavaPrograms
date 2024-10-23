package Task_014102024;

public class Task1 {
   /* public static void main(String[] args)
    {
        //Largest of 3 numbers
        int a=100;
        int b=120;
        int c=160;
        int result=(a >= b && a >= c) ? a : (b >= c ? b : c);
        System.out.println("The largest number among a,b,c is:"+ result);
    }

}

    */
public static void main(String[] args)
    {
        int a, b,c;
        a=10;
        b=60;
        c=40;
        String result= a>b && a>c?"a is greater":b>c?"b is greater":"c is greater";
        System.out.println(result);
    }
}

