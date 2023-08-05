import java.util.Scanner;
public class add{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int S=sc.nextInt();
        int B=sc.nextInt();
        int C=2*T*S*B*512;
        System.out.println(C);
    }
}