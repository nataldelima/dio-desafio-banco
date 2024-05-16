package Conta;

import Cliente.Cliente;

public abstract class Conta {
    private int agencia;
    private int numero;
    private Cliente cliente;
    protected double saldo;

    public Conta(int agencia, int numero, Cliente cliente, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void sacar(double valor);

    public void depositar(double valor) {
        saldo += valor;
    };

    public void transferir(double valor, Conta contaDestino) {
        if (saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para essa operação!");
        }
    };

    public abstract void extratoBancario();
}
