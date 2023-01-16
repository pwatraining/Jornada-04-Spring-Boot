package br.com.pwatraining.template.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="pedido_vendas")
@Data
public class PedidoVenda {

	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
    @JoinColumn(name="cliente_id", nullable=false)
	private Cliente cliente;
	
	
}
