package classes_e_metodos;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 3_999.99;
        p1.desconto = 0.25;

        Produto p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 1.99;
        p2.desconto = 0.10;

        System.out.println(p1.nome);
        double preco1 = p1.preco * (1 - p1.desconto);
        System.out.println(preco1);
        System.out.println(p2.nome);
        double preco2 = p2.preco * (1 - p2.desconto);
        System.out.println(preco2);
        System.out.println("Total " + (preco1 + preco2));
    }
}
