
package br.com.pwatraining.template.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pwatraining.template.entity.PedidoVenda;

public interface IPedidoVendaDao extends JpaRepository<PedidoVenda, Long> {


}