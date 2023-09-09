import java.util.*;
public class j{
    public static void main(String argd[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0,sum1=0;
        for(int i=0;i<t;i++)
        {
            if(i%2==0)
            {
                sum+=arr[i];
            }
            else
            {
                sum1+=arr[i];
            }
        }
        int n=sum-sum1;
        if(Math.abs(n)%4==0)
        {
            System.out.println("X");
        }
        else
        {
            System.out.println("Y");
        }
    }
}