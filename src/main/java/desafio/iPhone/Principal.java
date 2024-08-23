package main.java.desafio.iPhone;

import java.util.Scanner;

public class Principal {
    static Scanner scanner = new Scanner(System.in);
    public static final String ANSI_RESET = "\u001B[0m"; // constante faz com que a cor do texto volte ao normal
    public static final String ANSI_RED = "\u001B[31m"; // constante para mudar a cor do texto que será exibido

    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new iPhone();
        AparelhoTelefonico aparelho = new iPhone();
        NavegadorInternet navegador = new iPhone();

        System.out.println(ANSI_RED + "------------------------------" + ANSI_RESET);
        System.out.println("1 - Ouvir música!");
        System.out.println("2 - Usar telefone!");
        System.out.println("3 - Enviar mensagem de áudio!");
        System.out.println("4 - Acessar o navegador!");
        System.out.println(ANSI_RED + "------------------------------" + ANSI_RESET);
        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                reprodutor.tocar();
                break;
            case 2:
                aparelho.ligar("3235439867");
                break;
            case 3:
                aparelho.iniciarCorreioVoz("Olá, eu estou usando whatsapp", "3235419900");
                break;
            case 4:
                navegador.exibirPagina("https://www.google.com.br");
                break;

            default:
                break;
        }

        scanner.close();
    }
}
