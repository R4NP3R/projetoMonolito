package ranper.dao.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import ranper.dao.Persistente;
import ranper.exceptions.DAOException;
import ranper.exceptions.MaisDeUmRegistroException;
import ranper.exceptions.TableException;
import ranper.exceptions.TipoChaveNaoEncontradaException;


public interface IGenericJpaDAO <T extends Persistente, E extends Serializable> {



    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;
}
