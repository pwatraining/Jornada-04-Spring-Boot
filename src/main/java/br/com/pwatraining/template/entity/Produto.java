package br.com.pwatraining.template.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
