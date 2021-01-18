package orientacao_a_objetos.game;

public class Jogo {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        jogador.x = 10;
        jogador.y = 10;

        jogador.andar(Direcao.NORTE);
        jogador.andar(Direcao.NORTE);
        jogador.andar(Direcao.LESTE);
        jogador.andar(Direcao.OESTE);
        jogador.andar(Direcao.OESTE);
        jogador.andar(Direcao.SUL);

        System.out.println(jogador.y);
        System.out.println(jogador.x);
    }
}
