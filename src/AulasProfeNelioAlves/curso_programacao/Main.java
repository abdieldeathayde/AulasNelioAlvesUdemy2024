package AulasProfeNelioAlves.curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double multa = 50.00;

        int minutos = sc.nextInt();

        if (minutos > 100) {
            multa += (minutos - 100) * 2.0 ;

        }

        System.out.printf("Valor a pagar: R$ %.2f ", multa);

        sc.close();

    }
}
