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
        for(int i=0;i<t;i++)
        {
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        
    }
}