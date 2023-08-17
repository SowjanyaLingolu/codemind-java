import java.util.Scanner;
public class factor{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        if(t>3 && t<7)
        {
            System.out.println("Summer");
        }
        else if(t>6 && t<11)
        {
            System.out.println("Rainy");
        }
        else if(t==11 || t==12 || t==1)
        {
            System.out.println("Winter");
        }
        else if(t==2 || t==3)
        {
            System.out.println("Spring");
        }
        else
        {
            System.out.println(-1);
        }
    }
}