package ranper.services;

import ranper.dao.IClienteDAO;
import ranper.domain.Cliente;
import ranper.exceptions.DAOException;
import ranper.exceptions.MaisDeUmRegistroException;
import ranper.exceptions.TableException;
import ranper.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {



    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
        //this.clienteDAO = clienteDAO;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}
