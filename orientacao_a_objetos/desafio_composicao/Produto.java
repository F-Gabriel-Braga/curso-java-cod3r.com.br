package orientacao_a_objetos.desafio_composicao;

import java.util.ArrayList;

public class Produto {
    ArrayList<Item> items = new ArrayList<>();
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
