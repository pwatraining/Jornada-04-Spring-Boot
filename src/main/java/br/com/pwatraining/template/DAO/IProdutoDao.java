
package br.com.pwatraining.template.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.pwatraining.template.entity.Produto;

public interface IProdutoDao extends JpaRepository<Produto, Long> {

	@Query("select u from Produto u where u.descricao like ?1 ")
	public List<Produto> findByPartialDescricao(String partialDescricao);

}