package task4;

public class PrintChislaB {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > 0; j--) {
                if (j > i) System.out.print("  ");
                else System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
