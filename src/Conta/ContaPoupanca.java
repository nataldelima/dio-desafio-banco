package Conta;

import Cliente.Cliente;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(int agencia, int numero, Cliente cliente, double saldo) {
        super(agencia, numero, cliente, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public void extratoBancario() {
        System.out.println("\nExtrato da Conta Poupança:");
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("Saldo: R$" + getSaldo());
    }
}
