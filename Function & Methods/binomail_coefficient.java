import java.util.Scanner;

public class binomail_coefficient {
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }

    public static int binCoeff(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nr=factorial(n-r);
        int ncr=fact_n / (fact_r * fact_nr);
        return ncr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        System.out.println("Enter r: ");
        int r=sc.nextInt();
        
        int ans=binCoeff(n, r);
        System.out.println(ans);
    }
}
