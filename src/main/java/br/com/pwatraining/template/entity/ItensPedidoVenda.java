package br.com.pwatraining.template.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="itens_pedido_venda")
@Data
public class ItensPedidoVenda {

	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
    @JoinColumn(name="pedido_venda_id", nullable=false)
	private PedidoVenda pedidoVenda;
	
	@ManyToOne
	@JoinColumn(name="produto_id", nullable=false)
	private Produto produto;
	
	private Long quantidade;
	
}
