import java.util.Scanner;
public class prog{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double A=sc.nextFloat();
        double B=sc.nextFloat();
        double C=A*B;
        System.out.printf("%.2f",C);
    }
}