package AulasProfeNelioAlves.secao6;

import java.util.Scanner;

public class MainAula44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite zero para sair ou digite outro numero");
        int numero = sc.nextInt();
        int soma = 0;

        while (numero != 0) {
            soma += numero;

            System.out.println("Digite zero para sair ou digite outro numero");
            numero = sc.nextInt();
        }
        System.out.println("Soma: " + soma);
    }


}
