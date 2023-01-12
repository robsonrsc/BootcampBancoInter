package EstruturasDeRepeticao;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int qtdnumero;
        int numero;
        int par=0;
        int impar=0;


        System.out.println("Insira quantos numeros voce quer: \n");
        qtdnumero = scan.nextInt();

        int count = 0;

        do {

            System.out.println("numero: ");
            numero = scan.nextInt();

            count++;
            if (numero%2==0){par++;}
            else{
                impar++;
            }
        }while (count<qtdnumero);

        System.out.printf("Numeros pares igual a %d \n",par);
        System.out.printf("Numeros impares igual a %d \n",impar);

    }
}
