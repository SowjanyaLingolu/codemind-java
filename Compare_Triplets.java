import java.util.*;
public class j{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int arr[]=new int[3];
        int brr[]=new int[3];
        for(int i=0;i<3;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            brr[i]=sc.nextInt();
        }
        int a=0,b=0;
        for(int i=0;i<3;i++)
        {
           if(arr[i]>brr[i])
           {
               a++;
           }
           else if(arr[i]<brr[i])
           {
               b++;
           }
        }
        System.out.println(a+" "+b);
    }
}