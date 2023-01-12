package EstruturasDeRepeticao;

import java.util.List;
import java.util.Scanner;

public class NotaALuno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("\n Insira uma nota: \n");

        nota = scan.nextInt();

        while (nota < 0 | nota > 10) {

            System.out.println("Nota invalida. Digite novamente ");

            nota = scan.nextInt();

        }

        System.out.println(nota + " Nota cadastrada");
    }
}