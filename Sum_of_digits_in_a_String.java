import java.util.*;
public class sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                int d=Character.getNumericValue(ch);
                sum+=d;
            }
        }
        System.out.print(sum);
    }
}