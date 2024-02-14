package AulasProfeNelioAlves.secao7;

public class Aula58 {
    public static void main(String[] args) {
        String s = "potato apple lemon orange";

        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
        String word4 = vect[3];

        System.out.println("word1: " + word1 + "\nword2: " + word2 + "\nword3: " + word3 + "\nword4: " + word4);
    }
}
