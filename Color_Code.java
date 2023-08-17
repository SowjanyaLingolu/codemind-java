import java.util.Scanner;
public class factor{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char t=sc.next().charAt(0);
        if(t=='V' || t=='v')
        {
            System.out.println("Violet");
        }
        else if(t=='I' || t=='i')
        {
            System.out.println("Indigo");
        }
        else if(t=='B' || t=='b')
        {
            System.out.println("Blue");
        }
        else if(t=='G' || t=='g')
        {
            System.out.println("Green");
        }
         else if(t=='Y' || t=='y')
        {
            System.out.println("Yellow");
        }
         else if(t=='O' || t=='o')
        {
            System.out.println("Orange");
        }
         else if(t=='R' || t=='r')
        {
            System.out.println("Red");
        }
        else
        {
            System.out.println(-1);
        }
    }
}