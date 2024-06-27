import singleton.SistemaBancario;
import repository.Cliente;
import repository.RepositorioCliente;
import strategy.Conta;

public class BancoFacade {
    private SistemaBancario sistemaBancario;

    public BancoFacade() {
        this.sistemaBancario = SistemaBancario.getInstancia();
    }

    public void criarCliente(int id, String nome, Conta conta) {
        Cliente cliente = new Cliente(id, nome, conta);
        sistemaBancario.getRepositorioCliente().adicionarCliente(cliente);
    }

    public void depositar(int clienteId, double quantia) {
        Cliente cliente = sistemaBancario.getRepositorioCliente().getClientePorId(clienteId);
        if (cliente != null) {
            cliente.getConta().depositar(quantia);
            System.out.println("Depositado " + quantia + " na conta de " + cliente.getNome());
        } else {
            System.out.println("Cliente não encontrado");
        }
    }

    public void sacar(int clienteId, double quantia) {
        Cliente cliente = sistemaBancario.getRepositorioCliente().getClientePorId(clienteId);
        if (cliente != null) {
            cliente.getConta().sacar(quantia);
            System.out.println("Sacado " + quantia + " da conta de " + cliente.getNome());
        } else {
            System.out.println("Cliente não encontrado");
        }
    }

    public void verificarSaldo(int clienteId) {
        Cliente cliente = sistemaBancario.getRepositorioCliente().getClientePorId(clienteId);
        if (cliente != null) {
            System.out.println("Saldo da conta de " + cliente.getNome() + ": " + cliente.getConta().getSaldo());
        } else {
            System.out.println("Cliente não encontrado");
        }
    }
}
