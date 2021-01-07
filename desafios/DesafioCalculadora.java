package desafios;

import javax.swing.*;

public class DesafioCalculadora {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        char oper = JOptionPane.showInputDialog("Digite a operação desejada (+, -, *, /, %):").trim().charAt(0);
        int resultado = (oper=='+') ? (num1 + num2) : ((oper=='-') ? (num1 - num2) : ((oper=='*') ? (num1 * num2) : ((oper=='/') ? (num1 / num2) : ((oper=='%') ? (num1 % num2) : 0))));
        JOptionPane.showMessageDialog(null, num1 + " " + oper + " " + num2 + " = " + resultado);
    }
}
