package br.com.pwatraining.template.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="produto")
@Data
public class Produto {

	@Id
	@GeneratedValue
	private Long id;
	
	private String descricao;
	private String preco;
	
}
