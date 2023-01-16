package br.com.pwatraining.template.service;

import java.util.List;
import java.util.Optional;

import br.com.pwatraining.template.entity.PedidoVenda;

public interface IPedidoVendaService {

	public PedidoVenda salvar(PedidoVenda PedidoVenda);
	public void excluir(PedidoVenda PedidoVenda);
	public Optional<PedidoVenda> findPedidoVenda(Long id);
	public List<PedidoVenda> listaPedidoVendas();



}


