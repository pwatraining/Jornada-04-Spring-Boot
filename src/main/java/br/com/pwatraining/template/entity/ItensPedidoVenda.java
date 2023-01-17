package br.com.pwatraining.template.entity;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
