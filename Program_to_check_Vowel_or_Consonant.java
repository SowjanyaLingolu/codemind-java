import java.util.Scanner;
public class factor{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char t=sc.next().charAt(0);
        if(t=='A' || t=='E' || t=='I' || t=='O' || t=='U'|| t=='a' || t=='e' || t=='i' || t=='o' || t=='u' )
        {
            System.out.println("Vowel");
        }
        else 
        {
            System.out.println("Consonant");
        }
    }
}