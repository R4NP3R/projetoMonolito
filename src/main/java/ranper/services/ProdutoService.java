package ranper.services;

import ranper.dao.IProdutoDAO;
import ranper.domain.Produto;
import ranper.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
