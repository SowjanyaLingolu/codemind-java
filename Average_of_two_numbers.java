import java.util.Scanner;
public class Avg{
    public static void main(String arg[])
    {
        Scanner av=new Scanner(System.in);
        float A,B,C;
        A=av.nextFloat();
        B=av.nextFloat();
        C=(A+B)/2;
        System.out.printf("Average of %.0f and %.0f is: %.2f",A,B,C);
    }
}