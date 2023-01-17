package br.com.pwatraining.template.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
