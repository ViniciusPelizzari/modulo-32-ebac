/**
 * 
 */
package br.com.vpelizzarisilva.services;

import br.com.vpelizzarisilva.dao.IProdutoDAO;
import br.com.vpelizzarisilva.domain.Produto;
import br.com.vpelizzarisilva.services.generic.GenericService;

/**
 * @author Vinícius Pelizzari
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
