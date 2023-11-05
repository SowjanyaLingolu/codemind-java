import java.util.*;
public class Abs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int[][] brr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                brr[i][j]=sc.nextInt();
            }
        }
        int[][] res = new int[n][n];
        for(int i=0;i<n;i++){
              for(int j=0;j<n;j++){
                res[i][j] = arr[i][j]+brr[i][j];
            }
        }
        for(int i=0;i<n;i++){
              for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}