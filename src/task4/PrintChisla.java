package task4;

public class PrintChisla {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0; j--) {
                if (j > i) continue;
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
