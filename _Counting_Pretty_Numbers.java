import java.util.Scanner;
public class lastdig{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=0;
            for(int j=a;j<=b;j++)
            {
                int f=j%10;
                if(f==2 | f==3 || f==9)
                {
                    c+=1;
                }
            }
            System.out.println(c);
        }
    }
}