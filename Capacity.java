import java.util.Scanner;
public class capacity{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner (System.in);
        int T,S,B,C;
        T=sc.nextInt();
        S=sc.nextInt();
        B=sc.nextInt();
        C=(2*T*S*B*512)/1024;
        System.out.println(C+" KB");
    }
}