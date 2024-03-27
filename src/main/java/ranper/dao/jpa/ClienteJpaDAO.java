package ranper.dao.jpa;

import ranper.dao.ClienteDAO;
import ranper.dao.generic.jpa.GenericJpaDAO;
import ranper.domain.jpa.ClienteJpa;
import ranper.exceptions.DAOException;
import ranper.exceptions.MaisDeUmRegistroException;
import ranper.exceptions.TableException;
import ranper.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }

}