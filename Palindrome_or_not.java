import java.util.*;
public class squ{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a =s.toLowerCase();
        StringBuilder sd = new StringBuilder(a);
        sd.reverse();
        String ss = sd.toString();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(a.charAt(i)==ss.charAt(i)){
            c+=1;
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