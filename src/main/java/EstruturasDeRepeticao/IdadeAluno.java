package EstruturasDeRepeticao;

import java.util.Scanner;

public class IdadeAluno {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);


        while (true) {
            System.out.println("\n\nInsira o nome: ");
            String nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Insira a idade: ");
            int idade = scan.nextInt();



            System.out.printf("\nNome do aluno e %s", nome);
            System.out.printf("\nA idade e %d", idade);
        }

        System.out.println("teste de continuidade");

    }
}
