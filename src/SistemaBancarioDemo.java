import strategy.Conta;
import strategy.ContaPoupanca;
import strategy.ContaCorrente;

public class SistemaBancarioDemo {
    public static void main(String[] args) {
        BancoFacade bancoFacade = new BancoFacade();

        Conta contaPoupanca = new ContaPoupanca();
        Conta contaCorrente = new ContaCorrente();

        bancoFacade.criarCliente(1, "João Silva", contaPoupanca);
        bancoFacade.criarCliente(2, "Maria Santos", contaCorrente);

        bancoFacade.depositar(1, 1000);
        bancoFacade.sacar(1, 500);
        bancoFacade.verificarSaldo(1);

        bancoFacade.depositar(2, 2000);
        bancoFacade.sacar(2, 1500);
        bancoFacade.verificarSaldo(2);
    }
}
