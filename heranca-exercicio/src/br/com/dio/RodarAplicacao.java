package br.com.dio;

public class RodarAplicacao {

    public static void main(String[] args){

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();  //Upcast
        Funcionario faxineiro = new Faxineiro();

       // Vendedor vendedor = (Vendedor) new Funcionario(); //Downcast
    }
}
