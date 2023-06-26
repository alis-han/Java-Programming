public class hollow_rectangle{
    public static void main(String[] args) {
        rectangle(4, 5);
    }

    public static void rectangle(int totRows,int totCols){
        // Outer_loOP...
        for(int i=1;i<=totRows;i++){
            // Inner_loop...
            for(int j=1;j<=totCols;j++){
                // Boundary Values Conditions Check
                if(i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}