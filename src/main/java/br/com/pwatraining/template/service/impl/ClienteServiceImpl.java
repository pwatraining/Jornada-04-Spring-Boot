package br.com.pwatraining.template.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pwatraining.template.DAO.IClienteDao;
import br.com.pwatraining.template.entity.Cliente;
import br.com.pwatraining.template.service.IClienteService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	IClienteDao clienteDao;

	@Override
	public Cliente salvar(Cliente cliente) {
		cliente = clienteDao.save(cliente);
		log.info("Persistindo Item id: " + cliente.getId());
		return cliente;
	}

	@Override
	public void excluir(Cliente cliente) {
		clienteDao.delete(cliente);
		log.info("Excluindo Item id: " + cliente.getId());
	}
	
	public List<Cliente> listaClientes() {
		log.info("Listando Todos os Clientes");
		return clienteDao.findAll();
	}

	public Optional<Cliente> findCliente(Long id) {
		log.info("Buscando Cliente Por Id");
		Optional<Cliente> cliente = clienteDao.findById(id);
		return cliente;
	}

	public List<Cliente> findByPartialName(String partialName) {
		log.info("Buscando por Nome Parcial");
		return clienteDao.findByPartialName("%" + partialName + "%");
	}


}
