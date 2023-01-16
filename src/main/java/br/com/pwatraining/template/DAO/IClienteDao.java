
package br.com.pwatraining.template.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.pwatraining.template.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

	@Query("select u from Cliente u where u.nome like ?1 ")
	public List<Cliente> findByPartialName(String partialName);

}