package fundamentos.exercicios;

import java.util.Scanner;

public class ConversorFahrenheitCelsius {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double fahrenheit = entrada.nextDouble();
        double celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celsius: " + celsius);
        entrada.close();
    }
}
