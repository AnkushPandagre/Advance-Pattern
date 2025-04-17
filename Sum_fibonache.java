import java.util.Scanner;

public class Sum_fibonache {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("enter number");
        int n = sc.nextInt();
        int a = 0;
        int b= 1;
          int count = 0;
          int sum = 0;
          while (count<n) {
            sum = sum +a;
            int res = a+b;
            a= b;
            b = res;
            count++;
          }
          System.out.println(sum);
    }
}
