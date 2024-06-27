package singleton;

import repository.RepositorioCliente;
import repository.RepositorioClienteImpl;

public class SistemaBancario {
    private static SistemaBancario instancia;
    private RepositorioCliente repositorioCliente;

    private SistemaBancario() {
        repositorioCliente = new RepositorioClienteImpl();
    }

    public static SistemaBancario getInstancia() {
        if (instancia == null) {
            instancia = new SistemaBancario();
        }
        return instancia;
    }

    public RepositorioCliente getRepositorioCliente() {
        return repositorioCliente;
    }
}
