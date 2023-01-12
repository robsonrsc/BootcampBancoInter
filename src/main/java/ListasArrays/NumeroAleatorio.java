package ListasArrays;

import java.util.Random;

public class NumeroAleatorio {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int [] numAletario = new int[20];

        for (int i=0; i<numAletario.length; i++){

            int numero = aleatorio.nextInt(100);

            numAletario[i]=numero;


        }

        for (int numero: numAletario) {

            System.out.print(numero + " ");

        }

        System.out.println("Numero com sucessores: ");
        for (int numero: numAletario) {

            System.out.print((numero+1) + " ");

        }

    }
}
