package repository;

import java.util.List;

public interface RepositorioCliente {
    void adicionarCliente(Cliente cliente);
    Cliente getClientePorId(int id);
    List<Cliente> getTodosClientes();
}
