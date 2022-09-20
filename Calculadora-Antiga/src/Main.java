import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("Menu de opções: \n1. Soma \n2. Subtração \n3. Divisão \n4. Multiplicação "
                + "\n5. Potenciação \n6. Porcentagem \n7. Raiz quadrada");
        int op = Sc.nextInt();

        System.out.println("Insira a quantidade de números (máximo 5): ");
        int amount = Sc.nextInt();

        double result = 0;

        switch (op) {

            case 1:
                for (int i = 0; i < amount; i++) {
                    System.out.println("Insira um número: ");
                    double x = Sc.nextDouble();
                    result += x;
                }
                break;

            case 2:
                for (int i = 0; i < amount; i++) {
                    System.out.println("Insira um número: ");
                    double x = Sc.nextDouble();
                    if (i == 0) {
                        result = x;
                    } else {
                        result -= x;
                    }

                }
                break;

            case 3:
                for (int i = 0; i < amount; i++) {
                    System.out.println("Insira um número: ");
                    double x = Sc.nextDouble();
                    if (i == 0) {
                        result = x;
                    } else {
                        result /= x;
                    }

                }
                break;

            case 4:
                for (int i = 0; i < amount; i++) {
                    System.out.println("Insira um número: ");
                    double x = Sc.nextDouble();
                    if (i == 0) {
                        result = x;
                    } else {
                        result *= x;
                    }

                }
                break;

            case 5:
                for (int i = 0; i < amount; i++) {
                    System.out.println("Insira um número: ");
                    double x = Sc.nextDouble();


                    if (i == 0) {
                        result = x;
                    } else {
                        result = Math.pow(result, x);
                    }
                }

                break;

            case 6:
                for (int i = 0; i < amount; i++) {
                    System.out.println("Insira um número: ");
                    double x = Sc.nextDouble();


                    if (i == 0) {
                        result = x;
                    } else {
                        result = result * x / 100;
                    }
                }

                break;

            case 7:
                System.out.println("Insira o número: ");
                double x = Sc.nextDouble();

                result = Math.sqrt(x);

                break;
        }

        System.out.println(result);

        Sc.close();
    }


}
