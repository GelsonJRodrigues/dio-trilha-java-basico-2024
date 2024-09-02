package main.java.desafio.BancoDigitalJava;

public class Main {
    
        public static void main(String[] args) {   

        Cliente cliente = new Cliente();
        cliente.setNome("Gelson Rodrigues");
      
        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(12000);
        cc.transferir(2200, poupanca);
        cc.sacar(610);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();        
    }   

}
