package fundamentos.exercicios;

import java.util.Scanner;

public class CalculaIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a altura: (m)");
        double altura = Double.parseDouble(entrada.nextLine().replace(",", "."));
        System.out.println("Digite o peso: (kg)");
        double peso = Double.parseDouble(entrada.nextLine().replace(",", "."));
        double imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);
        entrada.close();
    }
}
