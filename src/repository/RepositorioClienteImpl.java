package repository;

import java.util.ArrayList;
import java.util.List;

public class RepositorioClienteImpl implements RepositorioCliente {
    private List<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente getClientePorId(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public List<Cliente> getTodosClientes() {
        return clientes;
    }
}
