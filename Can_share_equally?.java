import java.util.Scanner;
public class factor{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int c=(x1*1)+(x2*2);
           if(x1!=0)
           {
               if(x1%2==0)
               {
                   System.out.println("YES");
               }
               else
               {
                   System.out.println("NO");
               }
           }
           else
           {
               if(x2%2==0)
               {
                   System.out.println("YES");
               }
               else
               {
                   System.out.println("NO");
               }
           }
    }
}