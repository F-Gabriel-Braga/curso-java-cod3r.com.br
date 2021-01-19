package orientacao_a_objetos.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(50.0);

        System.out.println(convidado.getPeso());

        Arroz arroz = new Arroz(2.0);
        convidado.comer(arroz);
        System.out.println(convidado.getPeso());

        Sorvete sorvete = new Sorvete(3.0);
        convidado.comer(sorvete);
        System.out.println(convidado.getPeso());
    }
}
