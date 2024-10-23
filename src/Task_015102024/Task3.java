package Task_015102024;

public class Task3 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);
    }
}
/*  Exp     a
    19  ->  19
    19 - >  20
    20  ->  19
 */