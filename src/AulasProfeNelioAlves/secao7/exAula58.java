package AulasProfeNelioAlves.secao7;

import java.util.Scanner;

public class exAula58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: \n");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        System.out.println("O maior número eh: " + higher);
        sc.close();
    }
    public static int max(int a, int b, int c) {
        int higher;
        if (a > b && a > c) {
            higher = a;
        } else higher = Math.max(b, c);
        return higher;
    }
}
