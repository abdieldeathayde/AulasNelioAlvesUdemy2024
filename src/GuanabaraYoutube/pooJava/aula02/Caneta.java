package GuanabaraYoutube.pooJava.aula02;

public class Caneta {
    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampada = false;
    boolean rabiscando = false;

    void tampar() {
        if (tampada == false) {
            System.out.println("Tampando caneta...");
            tampada = true;
        } else {
            System.out.println("Erro! Caneta já está tampada");
        }
    }

    void status() {
        System.out.println("--------------STATUS--------------");
        System.out.println("Modelo" + modelo + "\nUma caneta: " + cor + "\nPonta " + ponta + "\nCarga: " + carga + "\nEstá tampada? " + tampada);
    }

    void rabiscar() {
        if (tampada == false) {
            System.out.println("Caneta está rabiscando!");
            rabiscando = true;
        } else {
            System.out.println("Erro! Não posso rabiscar, pois, caneta está tampada!");
        }
    }

    void destampar() {
        if (tampada == true) {
            System.out.println("Destampando caneta!");
            tampada = false;
        } else {
            System.out.println("Erro! A caneta já está destampada");
        }
    }
}
