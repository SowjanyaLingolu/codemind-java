import java.util.*;
public class selfDividing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
            int j=0,n=0;
            int rem=0;
            int temp=i;
            if(i%10!=0){
                while(temp>0){
                rem=temp%10;
                temp=temp/10;
                j++;
                if(i%rem==0){
                    n++;
                }
              }
              if(n==j){
                  System.out.print(i+" ");
              }
            }
            
        }
    }
}