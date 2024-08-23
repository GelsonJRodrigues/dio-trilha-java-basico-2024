package main.java.desafio.ControleDeFluxo;

import java.util.Scanner;

public class Contador {

    public static final String ANSI_RESET = "\u001B[0m"; // constante faz com que a cor do texto volte ao normal
    public static final String ANSI_RED = "\u001B[31m"; // constante para mudar a cor do texto que será exibido

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.printf(ANSI_RED + "Digite o primeiro parâmetro: " + ANSI_RESET);
        int parametroUm = terminal.nextInt();
        System.out.printf(ANSI_RED + "Digite o segundo parâmetro: " + ANSI_RESET);
        int parametroDois = terminal.nextInt();

        terminal.close();

        try {
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException contarException) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException(null);
        }

        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.print(i + "   ");
        }
    }

}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String string) {
    }
}
