// Ques3: PallinDrome or Not...

import java.util.Scanner;

public class assignQues3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to check PalinDrome or not: ");
        int num=sc.nextInt();

        if(palindrome(num)){
            System.out.println("PalinDrome Number");
        }
        else{
            System.out.println("Not a palinDrome Number");
        }
    }

    public static boolean palindrome(int num){
        int original_num=num;
        int rev_num=0;
        while(num !=0){
            int lastDigit=num%10;
            rev_num=rev_num*10 + lastDigit;
            num/=10;
        }

        if(rev_num==original_num){
            return true;
        }
        return false;   
    }
}
