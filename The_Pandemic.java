import java.util.Scanner;
public class pandemic{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        if(t==1)
        {
            System.out.println(0);
        }
        else if(t==2)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(2);
        }
    }
}