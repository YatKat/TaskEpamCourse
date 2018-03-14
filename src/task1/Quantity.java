package task1;

public class Quantity {
   static int a = 12333456;
   static int b = 3;
    public static void main(String[] args) {
       // String numberInString = String.valueOf(a);
        int count = 0;

        while (a!=0) {
            int partOfNum = a%10;
            a = a/10;
            if(partOfNum == b){
                count++;
            }
        }
        System.out.println("b present in a " + count+" time(s)");
    }
}
