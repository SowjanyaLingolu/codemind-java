import java.util.Scanner;
public class areac{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int T=(N*(N-1))/2;
        System.out.println(T);
    }
}