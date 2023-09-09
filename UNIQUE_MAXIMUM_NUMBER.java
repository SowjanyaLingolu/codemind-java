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
        int z=0,max=0;
        for(int i=0;i<t;i++)
        {
            int c=0;
            for(int j=0;j<t;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c==1)
            {
                z++;
                if(z>0)
                {
                    if(arr[i]>max)
                    {
                        max=arr[i];
                    }
                }
            }
        }
        if(z==0)
        {
            System.out.print("-1");
        }
        else
        {
            System.out.println(max);
        }
    }
}