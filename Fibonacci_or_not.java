import java.util.*;
public class fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=1;
        int c=0,d=0;
        for(int i=1;i<=(n+1);i++){
            c=a+b;
            a=b;
            b=c;
            if(c==n){
                d=1;
            }
        }
        if(n==0 || n==1){
            System.out.println("True");
        }
        else if(d==1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}