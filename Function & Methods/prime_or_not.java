import java.util.Scanner;

public class prime_or_not {

    public static boolean prime(int num){
        // Math.sqrt is optimization of code...
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        System.out.println(prime(num));
    }
}
