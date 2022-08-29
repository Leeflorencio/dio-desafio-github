package br.com.dio.array;

import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args){
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i ++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros Aleatorios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores de Numeros Aleatorios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print((numero+1) + " ");
        }
    }
}
