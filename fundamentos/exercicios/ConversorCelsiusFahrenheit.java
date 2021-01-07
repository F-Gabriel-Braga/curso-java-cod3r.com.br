package fundamentos.exercicios;

import java.util.Scanner;

public class ConversorCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double celsius = entrada.nextDouble();
        double fahrenheit = ((celsius * 9) / 5) + 32;
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        entrada.close();
    }
}
