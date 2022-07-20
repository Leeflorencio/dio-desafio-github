package br.com.dio;

public class ControleDeFluxo {

    public static void main(String[] args){

        String olhos = "azul";

        switch(olhos){

            case "azul":
                System.out.println("Seus olhos azuis como a tarde\n" +
                        "Na tarde de um domingo azul\n" +
                        "La Belle de Jour");
                break;

            case "castanho":
                System.out.println("A tempestade que chega\n" +
                        "É da cor dos teus olhos\n" +
                        "Castanhos");
                break;

            case "preto":
                System.out.println("Black eyes, I don't need 'em\n" +
                        "Blue tears, gimme freedom");
                break;
            default:
                System.out.println("cor inválida");
                break;
        }
    }
}
