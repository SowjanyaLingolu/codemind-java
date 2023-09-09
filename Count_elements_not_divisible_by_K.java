import java.util.*;
public class j{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<t;i++)
        {
            if(arr[i]%k!=0)
            {
                c++;
            }
        }
        System.out.println(c);
        
    }
}