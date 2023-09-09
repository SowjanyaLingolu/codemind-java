import java.util.*;
public class j{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String[] arr=new String[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.next();
        }
        int c=0;
        for(int i=0;i<t;i++)
        {
           int sum=0;
           sum+=arr[i].length();
           if(sum%2==0)
           {
               c++;
           }
        }
        System.out.println(c);
    }
}