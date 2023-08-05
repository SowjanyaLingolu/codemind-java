import java.util.Scanner;
public class area{
    public static void main(String srgs[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        double s=(a+b+c)/2;
        double t=Math.sqrt (s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",t);
    }
}