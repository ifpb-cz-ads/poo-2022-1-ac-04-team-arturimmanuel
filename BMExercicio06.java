import java.util.Scanner;

public class BMExercicio06 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        String[] dias = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};

        while (numero != 0) {
            System.out.print("Insira um número entre 1 e 7: ");
            numero = sc.nextInt();
            if (numero - 1 < 0) {
                break;
            }
            int numArray = numero-1;

            System.out.println(dias[numArray]);

        }
        sc.close();
    }
}