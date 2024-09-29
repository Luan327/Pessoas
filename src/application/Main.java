package application;

import entities.Pessoas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int numeroDePessoas = sc.nextInt();

        Pessoas[] pessoas = new Pessoas[numeroDePessoas];

        for (int i = 0; i < numeroDePessoas; i++) {
            System.out.println("Dados da " + (i + 1) + "ª Pessoa");
            sc.nextLine();
            System.out.print("NOME: ");
            String nome = sc.nextLine();

            System.out.print("IDADE: ");
            int idade = sc.nextInt();

            System.out.print("ALTURA: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoas(nome, altura, idade);
        }
        Pessoas.relatorio(pessoas);
    }
}