public class BMExercicio08 {
    public static void main(String[] args) {
        final int numero = 3;
        for (int i = 1; i <= 100; i++) {
            if (i % numero == 0) {
                System.out.println(i);
            }
        }
    }
}