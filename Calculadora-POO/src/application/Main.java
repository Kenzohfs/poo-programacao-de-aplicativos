package application;

import entities.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Menu de opções: \n1. Soma \n2. Subtração \n3. Divisão \n4. Multiplicação "
                + "\n5. Potenciação \n6. Porcentagem \n7. Raiz quadrada \n>");
        int op = Sc.nextInt();

        Calculadora calculadora = new Calculadora();

        if (op == 7) {
            System.out.print("Insira um número: \n>");
            calculadora.addNumeroLista(Sc.nextDouble());
        } else {
            System.out.print("Insira a quantidade de números (máximo 5): \n>");
            double amount = Sc.nextInt();

            for (int i = 0; i < amount; i++) {
                System.out.print("Insira um número: \n>");
                calculadora.addNumeroLista(Sc.nextDouble());
            }
        }

        System.out.println(calculadora.fazerOperacao(op));

        Sc.close();
    }
}
