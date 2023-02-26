import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gato{
    public static void main(String[] args) {

        //criando lista
        List<Cat> meusGatos = new ArrayList<>(){{
            add(new Cat("Mia",10,"branca"));
            add(new Cat("Zion",6,"preto"));
            add(new Cat("Snow",5,"branca"));
            add(new Cat("Pretinha",5,"mesclada"));
        }};
        System.out.println(meusGatos);

        System.out.println("Ordem aleatória");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);


    }

    static class Cat{
        private String nome;
        private Integer idade;
        private String cor;

        public Cat(String nome, Integer idade, String cor) {
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
        }

        public String getNome() {
            return nome;
        }

        public Integer getIdade() {
            return idade;
        }

        public String getCor() {
            return cor;
        }

        @Override
        public String toString() {
            return "{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", cor='" + cor + '\'' +
                    '}';
        }
    }
}