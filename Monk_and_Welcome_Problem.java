import java.util.*;
public class j{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[t];
        int brr[]=new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            brr[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            System.out.print(arr[i]+brr[i]+" ");
        }
        
    }
}