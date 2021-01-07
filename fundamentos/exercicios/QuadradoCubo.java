package fundamentos.exercicios;

import java.util.Scanner;

public class QuadradoCubo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int n = entrada.nextInt();
        System.out.println(n + "^" + 2 + " = " + (Math.pow(n, 2)));
        System.out.println(n + "^" + 3 + " = " + (Math.pow(n, 3)));
        entrada.close();
    }
}
