package orientacao_a_objetos.heranca.desafio_heranca;

public class Ferrari extends Carro {

    public Ferrari() {
        super(500);
    }

    @Override
    public boolean acelerar() {
        if((velocidade + 200.0) < VELOCIDADE_MAXIMA) {
            velocidade += 200.0;
            return true;
        }
        else {
            velocidade = VELOCIDADE_MAXIMA;
            return false;
        }
    }
}
