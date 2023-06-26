public class butterfly {
    public static void main(String[] args) {
        pattern(7);
    }
    public static void pattern(int n){
        // 1st Half
        for(int i=1;i<=n;i++){
            // stars__(i)
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces__2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // stars__(i)
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Half__MirrorImage...
        for(int i=n;i>=1;i--){
            // stars__(i)
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces__2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // stars__(i)
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
