/**
 * 
 */
package br.com.vpelizzarisilva.dao.factory;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.vpelizzarisilva.domain.Produto;

/**
 * @author Vinícius Pelizzari
 *
 */
public class ProdutoFactory {

	
	public static Produto convert(ResultSet rs) throws SQLException {
		Produto prod = new Produto();
		prod.setId(rs.getLong("ID_PRODUTO"));
		prod.setCodigo(rs.getString("CODIGO"));
		prod.setDescricao(rs.getString("DESCRICAO"));
		prod.setValor(rs.getBigDecimal("VALOR"));
		return prod;
	}
}
