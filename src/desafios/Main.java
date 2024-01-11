package desafios;

import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Locale.setDefault( new Locale ("en","US"));

        Scanner sc = new Scanner(System.in);

        double tempo = sc.nextDouble();
        double velocidadeMedia = sc.nextDouble();

        double distancia = tempo * velocidadeMedia;

        double quantidadeLitros = distancia / 12;

        String casasDecimais = String.format("%.3f", quantidadeLitros);


        System.out.println(casasDecimais);
    }
}