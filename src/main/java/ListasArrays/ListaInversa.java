package ListasArrays;

public class ListaInversa {
    public static void main(String[] args) {

        int [] vetor = {-15,68,-7, 5,7,10};
        int count = vetor.length-1;

        System.out.print("Vetor original: ");

        for(int i=0;i<=count;i++){
            System.out.print(vetor[i]+ " ");
        }
        //System.out.println(vetor[1]);



        System.out.print("\nVetor: ");
        while (count>=0){

            System.out.print(vetor[count]+" ");

            count--;
        }

    }
}
