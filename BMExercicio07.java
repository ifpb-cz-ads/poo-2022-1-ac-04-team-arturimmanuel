import java.util.Scanner;

public class BMExercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int x = sc.nextInt();
        int y = 0;

        while (y != 1) {
            if (x % 2 == 0) {
                y = x / 2;
            }
            else {
                y = 3 * x + 1;
            }

            System.out.println(y);

            x = y;
        }
        


        sc.close();
    }
}
