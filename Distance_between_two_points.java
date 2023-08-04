import java.util.Scanner;
public class dis{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        double A,B,C,D,dist;
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        D=sc.nextInt();
        dist=Math.sqrt ((A-C)*(A-C)+(B-D)*(B-D));
        System.out.printf("%.4f",dist);
    }
}