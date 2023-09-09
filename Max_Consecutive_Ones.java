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
        int c=0,max=0;
        for(int i=0;i<t;i++)
        {
            if(arr[i]==1)
            {
                c++;
            }
            else
            {
                c=0;
            }
            max=Math.max(max,c);
        }
        System.out.println(max);
        
    }
}