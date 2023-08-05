import java.util.Scanner;
public class areac{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float C=sc.nextInt();
        float F=32+(C*9/5);
        System.out.printf("%.2f",F);
    }
}