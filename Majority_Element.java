import java.util.*;
public class j{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
        }
        int z=0;
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
            if(c>(t/2))
            {
                z++;
                if(z==1)
                {
                    System.out.println(arr[i]);
                }
            }
        }
        
        
    }
}