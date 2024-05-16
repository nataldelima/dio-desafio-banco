import Banco.Banco;
import Cliente.Cliente;
import Conta.Conta;
import Conta.ContaCorrente;
import Conta.ContaPoupanca;

public class App {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("João", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-00");

        ContaCorrente cc1 = new ContaCorrente(1001, 246810, cliente1, 0);
        ContaPoupanca cp1 = new ContaPoupanca(2001, 135711, cliente2, 0);

        Banco banco = new Banco("Banco Nat S/A");
        banco.adicionarConta(cc1);
        banco.adicionarConta(cp1);

        cc1.depositar(500);
        cc1.sacar(200);
        cc1.extratoBancario();

        cp1.depositar(500);
        cp1.sacar(300);
        cp1.extratoBancario();

        Conta destino = banco.buscarConta(246810);
        if (destino != null) {
            cc1.transferir(300, destino);
            cc1.extratoBancario();
            destino.extratoBancario();
        } else {
            System.out.println("Conta destino não encontrada.");
        }

    }
}
