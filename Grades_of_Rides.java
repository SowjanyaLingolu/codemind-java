import java.util.Scanner;
public class factor{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int s=sc.nextInt();
        int e=sc.nextInt();
        if(h>50 && s>60 && e>100)
        {
            System.out.println("10");
        }
        else if(h>50 && s>60 )
        {
            System.out.println("9");
        }
        else if( s>60 && e>100)
        {
            System.out.println("8");
        }
        else if( h>50 && e>100)
        {
            System.out.println("7");
        }
        else if(h>50 || s>60 || e>100)
        {
            System.out.println("6");
        }
        else
        {
            System.out.println("5");
        }
    }
}