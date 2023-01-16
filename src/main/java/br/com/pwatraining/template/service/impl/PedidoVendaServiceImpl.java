package br.com.pwatraining.template.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pwatraining.template.DAO.IPedidoVendaDao;
import br.com.pwatraining.template.entity.PedidoVenda;
import br.com.pwatraining.template.service.IPedidoVendaService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PedidoVendaServiceImpl implements IPedidoVendaService {

	@Autowired
	IPedidoVendaDao pedidoVendaDao;

	@Override
	public PedidoVenda salvar(PedidoVenda pedidoVenda) {
		pedidoVenda = pedidoVendaDao.save(pedidoVenda);
		log.info("Persistindo Item id: " + pedidoVenda.getId());
		return pedidoVenda;
	}

	@Override
	public void excluir(PedidoVenda pedidoVenda) {
		pedidoVendaDao.delete(pedidoVenda);
		log.info("Excluindo Item id: " + pedidoVenda.getId());
	}
	
	public List<PedidoVenda> listaPedidoVendas() {
		log.info("Listando Todos os PedidoVendas");
		return pedidoVendaDao.findAll();
	}

	public Optional<PedidoVenda> findPedidoVenda(Long id) {
		log.info("Buscando PedidoVenda Por Id");
		Optional<PedidoVenda> pedidoVenda = pedidoVendaDao.findById(id);
		return pedidoVenda;
	}

}
