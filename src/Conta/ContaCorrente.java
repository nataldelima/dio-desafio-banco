package Conta;

import Cliente.Cliente;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(int agencia, int numero, Cliente cliente, double saldo) {
        super(agencia, numero, cliente, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo e limite insuficientes para saque.");
        }
    }

    @Override
    public void extratoBancario() {
        System.out.println("\nExtrato da Conta Corrente:");
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("Saldo: R$" + getSaldo());
    }
}
