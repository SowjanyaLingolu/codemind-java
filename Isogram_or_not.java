import java.util.*;
public class Isogramn{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c=0;
        int a=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    c+=1;
                }
            }
        }
        if(c==s.length()){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
}