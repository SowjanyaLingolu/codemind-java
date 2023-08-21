import java.util.Scanner;
public class sum{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        float sum=0;
        float i=1;
        while(i<=t)
        {
            double c=1/i;
            sum+=c;
            i++;
        }
        System.out.printf("%.2f",sum);
    }
}