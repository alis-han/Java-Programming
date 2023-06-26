public class pairsArray {
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        printPairs(number);
    }

    public static void printPairs(int number[]){
        int totalPairs=0;
        for(int i=0;i<number.length;i++){
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+number[i]+","+number[j]+")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("total Pairs: "+totalPairs);
    }
}
