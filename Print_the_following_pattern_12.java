import java.util.Scanner;
public class num{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
          for(int j=i;j<=n;j++)
           {
            System.out.print(j+" ");
           }
           System.out.print("
");
        }
    }
}