public class function_overloading {

    // Using__ PARAMETERS...
    
    // func to calc sum of 2 nums
    public static int sum(int a,int b){
        return a+b;
    }

    // func to calc sum of 3 nums
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    // USING__ DATA TYPES...

    // int product of two numbers
    public static int product(int a,int b){
        return a*b;
    }

    //  float product of two numbers
    public static float product(float a,float b){
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println(sum(10,12));
        System.out.println(sum(10,12,15));
        System.out.println(product(10,12));
        System.out.println(product(3.2f, 45.2f));
    }
}
