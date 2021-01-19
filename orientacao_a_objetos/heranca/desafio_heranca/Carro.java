package orientacao_a_objetos.heranca.desafio_heranca;

public class Carro {
    public double velocidade = 0;
    protected final double VELOCIDADE_MAXIMA;

    Carro(double velocidade_maxima) {
        this.VELOCIDADE_MAXIMA = velocidade_maxima;
    }

    public boolean frear() {
        if(velocidade >= 5) {
            velocidade -= 5.0;
            return true;
        }
        else {
            velocidade = 0.0;
        }
        return false;
    }

    public boolean acelerar() {
        if((velocidade + 5) < VELOCIDADE_MAXIMA) {
            velocidade += 5.0;
            return true;
        }
        else {
            velocidade = VELOCIDADE_MAXIMA;
            return false;
        }
    }
}
