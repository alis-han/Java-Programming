public class inverted_halfPyramidWith_Numbers {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}