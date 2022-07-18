package br.com.dio;

public class TipoDeDados {

    public static void main(String[] args){

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; - ultrapassou o tamanho permitido dentro do short.

        //int i1 = -10000000000; ultrapassa o limite minimo do int.
        int i2 = 28500;

        long l1 = 10000000000000000L;
        long l2 = 20000000000000000L;

        //float f1 = 4.5; - é necessário colocar a letra f no final da variavel float.
        float f2 = 10.68f;

        double d1 = 85.68;
        double d2 = 99.84d;

        char c1 = 'W';
        //char c2 = 'Tw'; - char utiliza somente 1 caractere.
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = " ag fkfh kfljef HFEFE564416";

        //String dt1 = "17/07/2022";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}
