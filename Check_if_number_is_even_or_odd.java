import java.util.Scanner;
public class factor{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        if(t%2!=0)
        {
            System.out.println("Odd");
        }
        else 
        {
            System.out.println("Even");
        }
    }
}