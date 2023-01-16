package br.com.pwatraining.template.service;

import java.util.List;
import java.util.Optional;

import br.com.pwatraining.template.entity.Cliente;

public interface IClienteService {

	public Cliente salvar(Cliente cliente);
	public void excluir(Cliente cliente);
	public Optional<Cliente> findCliente(Long id);
	public List<Cliente> listaClientes();
	public List<Cliente> findByPartialName(String partialName);


}


