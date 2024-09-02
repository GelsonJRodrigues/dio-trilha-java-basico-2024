Modelagem e diagramação da representação UML do componente BancoDigital Java, abrangendo suas funcionalidades como depósito, saque, transferência e saldo.

```mermaid
classDiagram
    class Banco {
        -nome: String
        -contas: List        
    }

    class Cliente {
        -nome: String
        -CPF: String        
    }

    class Conta {
        -agencia: int
        -numero: int
        -saldo: double
        -cliente: Cliente
        +depositar(valor: double) void
        +sacar(valor: double) void
        +transferir(valor: double) void
    }

    class ContaCorrente {
        -numero: int
        -modelo: String
        +imprimirExtrato(saldo: double) void        
    }

    class ContaPoupanca {
        -numero: int
        -modelo: String
        +imprimirExtrato(saldo: double) void        
    }

    class IConta {
        +sacar(valor: double)
        +depositar(valor: double)
        +transferir(valor: double)
        +imprimirExtrato(saldo: double)
    }
    Cliente "1..*" -- "1..*" Conta: Associado com
    Banco "1" *-- "0..*" Conta: Contém
    Banco "1" *-- "0..*" Cliente: Contém
    Conta "1" *-- "0..*" ContaCorrente
    Conta "1" *-- "0..*" ContaPoupanca
    Conta --|> IConta: implementa
        
    ```