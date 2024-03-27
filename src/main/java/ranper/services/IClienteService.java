package ranper.services;

import ranper.domain.Cliente;
import ranper.exceptions.DAOException;
import ranper.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

    Cliente buscarPorCPF(Long cpf) throws DAOException;


}
