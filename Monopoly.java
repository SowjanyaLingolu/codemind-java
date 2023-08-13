import java.util.Scanner;
public class rev{
    public static void main(String args[])
    { 
        int i;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=0;i<n;i++)
        {
           int r1=sc.nextInt();
           int r2=sc.nextInt();
           int r3=sc.nextInt();
           int a=r1+r2;
           int b=r2+r3;
           int c=r1+r3;
           if(r1==r2 && r2==r3 && r1==r3)
           {
                System.out.println("NO");
           }
           else if(r1>b || r2>c || r3>a)
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