package classes_e_metodos;

public class Produto {
    String nome;
    double preco;
    double desconto;

    double precoComDesconto() {
        return (preco * (1 - desconto));
    }
}
