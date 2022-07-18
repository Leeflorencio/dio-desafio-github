package br.com.dio;

public class Variaveis {
    public static void main(String[] args){

        int i;
       // int i; - variáveis não podem ter o mesmo nome.
        int I;
        //int 1a; - não podem iniciar com números.
        int _1a; // embora seja permitido, não é uma boa pratica.
        int $aq;

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //j = 15; - o valor da variavel final não pode ser alterada.
        int asrn2161mn;
        //int asrn265 78md; - não pode ter espaços na variavel.
        int asrn51$5_md = 10;
        //int asnr64154%54_md = 10; caracter % é invalido na variavel.

        asrn2161mn = 100;
        asrn51$5_md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto; - Boa pratica, primeria letra em minusculo.
        //final int numeroTentativas = 5;
        //final int QUANTIDADE_OPCOES = 25; - letras maiusculas devem ser usadas em variaveis final.
        int qtdProd = 30;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn2161mn);
        System.out.println(asrn51$5_md);

        System.out.println(quantidadeProduto);
        System.out.println(qtdProd);

    }
}
