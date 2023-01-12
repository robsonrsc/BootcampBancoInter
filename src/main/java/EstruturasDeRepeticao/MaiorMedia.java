package EstruturasDeRepeticao;

import java.util.Scanner;

public class MaiorMedia {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        /*int notaA;
        int notaB;
        int notaC;
        int notaD;
        int notaE;

        notaA = scan.nextInt();
        notaB = scan.nextInt();
        notaC = scan.nextInt();
        notaD = scan.nextInt();
        notaE = scan.nextInt();

        if (notaA>notaB){
            System.out.printf("Nota %d", notaA);
        }if (notaB>notaC){
            System.out.printf("Nota %d", notaB);

        }if (notaC>notaD){
            System.out.printf("Nota %d", notaC);

        }if (notaD>notaE){
            System.out.printf("Nota %d", notaD);

        }if (notaE>notaA){
            System.out.printf("Nota %d", notaE);

        }*/

        //Mesma logica com laco de repticao

        int numero;
        int maior = 0;
        int soma=0;
        int count = 0;


        do {

            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma =numero+soma;

            count++;

            if (numero>maior) maior= numero;

        }while (count<5);

        System.out.printf(" O maior numero e %d \n", maior);
        System.out.printf("A media e %d \n",(soma/count));
        System.out.println(soma);

    }
}
