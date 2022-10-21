import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // version 1.0
        double euros, dolares, cambio;
        Scanner obxScaner = new Scanner(System.in);
        System.out.println("Teclea euros");
        euros = obxScaner.nextDouble();
        System.out.println("Teclea cambio");
        cambio = obxScaner.nextDouble();

        dolares = euros * cambio;

        System.out.println(euros + "euros son" + dolares + "dolares");
    }
}