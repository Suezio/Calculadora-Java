package clases;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        double num1,num2,resultado;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = entrada.nextDouble();

        System.out.println("Digite OUTRO número: ");
        num2 = entrada.nextDouble();

        Operacao resul = new Operacao();
        resultado = resul.soma(num1, num2);
        System.out.println("A soma é = "+resultado);

        resultado = resul.subtracao(num1, num2);
        System.out.println("A Subtração é = "+resultado);

        resultado = resul.divisao(num1, num2);
        System.out.println("A divisão é = "+resultado);

        resultado = resul.multiplicacao(num1, num2);
        System.out.println("A Multiplicação é = "+resultado);
    }

}
