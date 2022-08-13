package br.com.dio.exercicio;

import java.util.Scanner;

public class Impares {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int impar;
        int impares;

        System.out.println("Digite apenas números impares: ");
        impar = scan.nextInt();

        while( impar % 2 == 0 ){
            System.out.println("Digite um número impar: ");
            impar = scan.nextInt();
        }
        System.out.println("Obrigado!");
    }
}
