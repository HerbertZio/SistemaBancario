package strategy;

public class ContaCorrente implements Conta {
    private double saldo;

    public void depositar(double quantia) {
        saldo += quantia;
    }

    public void sacar(double quantia) {
        if (quantia <= saldo) {
            saldo -= quantia;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
