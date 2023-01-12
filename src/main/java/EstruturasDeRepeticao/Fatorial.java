package EstruturasDeRepeticao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("insira o numero: ");
        int fatorial = scan.nextInt();

        int calculo = 1;
        for (int i=(fatorial);i>=0;i--){


            calculo = calculo*i;

            System.out.println(calculo);
        }

    }
}
