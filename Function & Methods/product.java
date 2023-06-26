import java.util.Scanner;

public class product {
    public static int calcProduct(int x,int y) { //parameters or formal parameters
        int product=x*y;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product=calcProduct(a,b); //arguments or actual parameters
        System.out.println("Sum is: "+product);
    }
}
