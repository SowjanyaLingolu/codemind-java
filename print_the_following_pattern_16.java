import java.util.Scanner;
public class star{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=n;j++)
           {
            System.out.printf("%d ",i);
           }
           System.out.printf("%n");
        }
    }
}