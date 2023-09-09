import java.util.*;
public class j{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] arr=new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            int c=0;
            for(int j=0;j<t;j++)
            {
                if(arr[i]>arr[j])
                {
                    c++;
                }
            }
            System.out.print(c+" ");
        }
    }
}