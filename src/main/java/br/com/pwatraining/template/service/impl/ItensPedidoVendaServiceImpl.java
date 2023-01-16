package br.com.pwatraining.template.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pwatraining.template.DAO.IItensPedidoVendaDao;
import br.com.pwatraining.template.entity.ItensPedidoVenda;
import br.com.pwatraining.template.service.IItensPedidoVendaService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ItensPedidoVendaServiceImpl implements IItensPedidoVendaService {

	@Autowired
	IItensPedidoVendaDao pedidoVendaDao;

	@Override
	public ItensPedidoVenda salvar(ItensPedidoVenda pedidoVenda) {
		pedidoVenda = pedidoVendaDao.save(pedidoVenda);
		log.info("Persistindo Item id: " + pedidoVenda.getId());
		return pedidoVenda;
	}

	@Override
	public void excluir(ItensPedidoVenda pedidoVenda) {
		pedidoVendaDao.delete(pedidoVenda);
		log.info("Excluindo Item id: " + pedidoVenda.getId());
	}
	
	public List<ItensPedidoVenda> listaItensPedidoVendas() {
		log.info("Listando Todos os ItensPedidoVendas");
		return pedidoVendaDao.findAll();
	}

	public Optional<ItensPedidoVenda> findItensPedidoVenda(Long id) {
		log.info("Buscando ItensPedidoVenda Por Id");
		Optional<ItensPedidoVenda> pedidoVenda = pedidoVendaDao.findById(id);
		return pedidoVenda;
	}

}
