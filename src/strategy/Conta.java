package strategy;

public interface Conta {
    void depositar(double quantia);
    void sacar(double quantia);
    double getSaldo();
}
