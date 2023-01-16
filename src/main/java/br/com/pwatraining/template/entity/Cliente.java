package br.com.pwatraining.template.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="cliente")
@Data
public class Cliente {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	private String endereco;
	private String email;
	private String telefone;
	
	
}
