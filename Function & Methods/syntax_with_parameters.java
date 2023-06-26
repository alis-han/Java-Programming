import java.util.Scanner;

public class syntax_with_parameters {
    public static int calcSum(int x,int y) { //parameters or formal parameters
        int sum=x+y;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calcSum(a,b); //arguments or actual parameters
        System.out.println("Sum is: "+sum);
    }
}
