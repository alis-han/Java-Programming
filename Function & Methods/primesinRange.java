import java.util.Scanner;

public class primesinRange {
    public static boolean prime(int num){
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int num){
        for(int i=2;i<=num;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        primesInRange(num);
    }
}
