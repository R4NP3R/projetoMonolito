package ranper.dao.jpa;

import ranper.dao.generic.jpa.IGenericJpaDAO;
import ranper.domain.jpa.VendaJpa;
import ranper.exceptions.DAOException;
import ranper.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaJpaDAO extends IGenericJpaDAO<VendaJpa, Long> {

    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;


    public VendaJpa consultarComCollection(Long id);
}
