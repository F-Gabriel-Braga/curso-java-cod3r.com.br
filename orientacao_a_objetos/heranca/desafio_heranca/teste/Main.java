package orientacao_a_objetos.heranca.desafio_heranca.teste;

import orientacao_a_objetos.heranca.desafio_heranca.Civic;
import orientacao_a_objetos.heranca.desafio_heranca.Ferrari;

public class Main {
    public static void main(String[] args) {
        Civic civic = new Civic();
        civic.frear();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.frear();

        Ferrari ferrari = new Ferrari();
        ferrari.frear();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.frear();

        System.out.printf("Ferrari: %.2f km/h\n", ferrari.velocidade);
        System.out.printf("Civic: %.2f km/h\n", civic.velocidade);
    }
}
