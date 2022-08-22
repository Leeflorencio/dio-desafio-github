package br.com.dio;

public class Impar {

    public static void main(String[] args){

        int i;
        int impares = 0;

        for(i=0; i <= 50; i++ ){
            if(i % 2 == 1)
                System.out.println(i);
        }
    }
}
