import java.util.Scanner;
public class bill{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String n=sc.nextLine();
        int a=sc.nextInt();
        double b;
        if(a<=199)
        {
            b=a*1.20;
        }
        else if(a>=200 && a<400)
        {
            b=a*1.50;
        }
        else if(a>=400 && a<600)
        {
            b=a*1.80;
        }
        else
        {
            b=a*2.00;
        }
        if(b>400)
        {
            System.out.printf("%.2f",b+(15*b)/100);
        }
        else
        {
            System.out.printf("%.2f",b+100);
        }
    }
}