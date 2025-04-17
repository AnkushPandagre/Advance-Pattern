import java.util.Scanner;

public class fibonache_series {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b= 1;
          int count = 0;
          while (count<n) {
            System.out.println(a);
            int res = a+b;
            a= b;
            b = res;
            count++;
          }
     
    }
}