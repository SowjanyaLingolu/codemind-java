import java.util.Scanner;
public class oct
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        int n=sc.nextInt();
        for (i=0;i<n;i++)
        {
            String a=sc.next();
            int b=Integer.parseInt(a,2);
            System.out.println(Integer.toString(b,8));
            
        }
    }
}