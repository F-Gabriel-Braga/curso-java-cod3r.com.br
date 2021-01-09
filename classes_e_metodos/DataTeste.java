package classes_e_metodos;

import java.util.Scanner;

public class DataTeste {
    public static void main(String args[]) {
        Data data1 = new Data();
        Data data2 = new Data();
        data1.dia = "30";
        data1.mes = "Dezembro";
        data1.ano = "2018";
        System.out.printf("%s %s de %s\n", data1.dia, data1.mes, data1.ano);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dia:");
        data2.dia = entrada.next();
        System.out.println("Digite o mes:");
        data2.mes = entrada.next();
        System.out.println("Digite o ano:");
        data2.ano = entrada.next();
        entrada.close();
        System.out.printf("%s %s de %s\n", data2.dia, data2.mes, data2.ano);
    }
}