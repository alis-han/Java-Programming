import java.util.Scanner;

public class factorial {
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ans=factorial(a);
        System.out.println(ans);
    }
}