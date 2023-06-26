import java.util.Scanner;

public class assignQues5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to calc sum: ");
        int num=sc.nextInt();
        System.out.println(sumDigits(num));
    }
    public static int sumDigits(int num){
        int sum=0;
        while(num>0){
            int lastDigit=num%10;
            sum+=lastDigit;
            num/=10;
        }
        return sum;
    }
}
