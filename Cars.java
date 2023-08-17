import java.util.Scanner;
public class factor{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c1=sc.nextInt();
        int c2=sc.nextInt();
        int x=sc.nextInt();
        if(c1>c2)
        {
            System.out.println(-1);
        }
        else 
        {
            System.out.println((c1+c2+x)/c2);
        }
       
    }
}