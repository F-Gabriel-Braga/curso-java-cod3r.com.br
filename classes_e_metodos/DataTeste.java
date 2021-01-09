package classes_e_metodos;

import java.util.Scanner;

public class DataTeste {
    public static void main(String args[]) {
        Data data1 = new Data();
        Data data2 = new Data();
        data1.dia = "30";
        data1.mes = "Dezembro";
        data1.ano = "2018";
        System.out.println(data1.obterDataFormatada());

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dia:");
        data2.dia = entrada.next();
        System.out.println("Digite o mes:");
        data2.mes = entrada.next();
        System.out.println("Digite o ano:");
        data2.ano = entrada.next();
        entrada.close();
        System.out.println(data2.obterDataFormatada());
    }
}