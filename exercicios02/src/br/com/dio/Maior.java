package br.com.dio;

import java.util.Scanner;

public class Maior {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int count = 0;

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if(numero > maior) maior = numero;

            count ++;
        } while(count < 5);

        System.out.println("------");
        System.out.println("Maior: " + maior);
    }
}
