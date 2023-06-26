// Question 2 : Write a method named isEven that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test your
// method.

import java.util.Scanner;

public class assignQues2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to check even or not: ");
        int num=sc.nextInt();

        if(evenOrNot(num)){
            System.out.println("EVen Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    public static boolean evenOrNot(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
