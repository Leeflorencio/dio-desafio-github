package br.com.dio;

public class Carro {                 //Classe

    String cor;                      //métodos
    String modelo;
    int capacidadeTanque;

    //construtores
    Carro(){}

    //sobrecarga
    Carro( String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;

    }

     void setCor(String cor){        //pega a cor
         this.cor = cor;
     }

     String getCor(){               //retorna a cor
         return cor;
     }

     void setModelo(String modelo){
         this.modelo = modelo;
     }

     String getModelo(){
         return modelo;
     }

     void setCapacidadeTanque(int capacidadeTanque){
         this.capacidadeTanque = capacidadeTanque;
     }

     int getCapacidadeTanque(){
         return capacidadeTanque;
     }

     // método
    double totalValorTanque(double valorCombustivel){
         return capacidadeTanque * valorCombustivel;
    }
}
