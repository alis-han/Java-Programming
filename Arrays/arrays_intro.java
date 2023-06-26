public class arrays_intro{
    public static void main(String[] args) {
        // Arrays Creation
        int marks[]=new int[50];

        // Arrays Input
        marks[0]=95;
        marks[1]=96;
        marks[2]=97;

        // Arrays Output
        System.out.println("Physics marks: "+marks[0]);
        System.out.println("Chemistry marks: "+marks[1]);
        System.out.println("Maths marks: "+marks[2]);

        // Arrays Update
        marks[1]=98;
        marks[1]=marks[1]+1;
        
        System.out.println("Updated Chemistry marks: "+marks[1]);

        // To get length of arrays use arrays.length;
        System.out.println("Arrays Length: "+marks.length);
    }
}