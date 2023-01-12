package EstruturasDeRepeticao;

import java.util.Scanner;

public class TabuadaLimitada {

    public static void main(String[] args) {
        int tabuada;

        Scanner scan = new Scanner(System.in);
        tabuada= scan.nextInt();

        for(int i=0;i<=10; i++){

            int calculo = tabuada*i;
            System.out.println(calculo);

        }



    }
}
