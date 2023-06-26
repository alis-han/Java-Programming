import java.util.*;
public class largestInArray {
    public static void main(String[] args) {
        int array[]={1,2,6,3,5};
        System.out.println("Largest Value is : "+getlargest(array));
    }

    public static int getlargest(int array[]){
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){
            if(largest<array[i]){
                largest=array[i];
            }
        }
        return largest;
    }
}
