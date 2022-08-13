package br.com.dio.exercicio;

import java.util.Scanner;

public class Usuario {

    public static void main(String[] args){
        //Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
        // igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome;

        System.out.println("Digite a sua senha: ");
        String senha;

        nome = scan.next();
        System.out.println("----");
        senha = scan.next();

        while(nome.equals(senha)){
            System.out.println("O nome e a senha não podem ser iguais! Digite novamente: ");
            nome = scan.next();
            System.out.println("----");
            senha = scan.next();
        }

    }
}
