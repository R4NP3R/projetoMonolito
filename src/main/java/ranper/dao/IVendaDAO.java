package ranper.dao;

import ranper.dao.generic.IGenericDAO;
import ranper.domain.Venda;
import ranper.exceptions.DAOException;
import ranper.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
