package main.java.desafio.ContaTerminal;

import java.text.NumberFormat; //implementa operações de entrada de dados pelo teclado
import java.util.Locale; //considera as representações regionais do alfabeto, símbolos, números e datas
import java.util.Scanner; //formata números conforme a localização geográfica

public class ContaTerminal {
    public static final String ANSI_RESET = "\u001B[0m"; // constante faz com que a cor do texto volte ao normal
    public static final String ANSI_RED = "\u001B[31m"; // constante para mudar a cor do texto que será exibido

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // instanciando e criando um objeto Scanner
         {
            System.out.println("Bem vindo ao banco");
            System.out.println("------------------");
            
            System.out.printf(ANSI_RED + "Digite a agencia: " + ANSI_RESET);
            String agencia = scanner.next();
            
            System.out.printf(ANSI_RED + "Digite o numero da conta: " + ANSI_RESET);
            int numeroConta = scanner.nextInt();
            
            scanner.nextLine(); // esvazia o buffer do teclado depois de ler um valor numérico
            
            System.out.printf(ANSI_RED + "Digite o nome do cliente: " + ANSI_RESET);
            String nomeCliente = scanner.nextLine();
            
            System.out.printf(ANSI_RED + "Informe o valor do depósito: " + ANSI_RESET);
            float saldoCliente = scanner.nextFloat();
            
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numeroConta + " e seu saldo de "
                    + NumberFormat.getCurrencyInstance().format(saldoCliente) + " já esta disponível para saque!");
        }

        scanner.close();

    }
}
