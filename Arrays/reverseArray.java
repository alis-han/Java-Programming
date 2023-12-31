// Time Complexity is O(n) but space Complexicity is O(1) as temp variable is only used...

public class reverseArray {
    public static void main(String[] args) {
       int numbers[]={2,4,6,8,10};
       reverse(numbers); 
       for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]+" ");
       }
    }

    public static void reverse(int numbers[]){
        int first=0 , last=numbers.length-1;

        while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
    }
}
