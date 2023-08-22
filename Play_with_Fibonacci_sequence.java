import java.util.Scanner;
public class fib{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int a=0,b=1,c;
        for(int i=0;i<A;i++)
        {
            System.out.printf("%d ",a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}