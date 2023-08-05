import java.util.Scanner;
public class avg{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double A=sc.nextInt();
        double B=sc.nextInt();
        double C=(A+B)/2;
        System.out.printf("%.4f",C);
    }
}