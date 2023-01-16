package br.com.pwatraining.template.service;

import java.util.List;
import java.util.Optional;

import br.com.pwatraining.template.entity.ItensPedidoVenda;

public interface IItensPedidoVendaService {

	public ItensPedidoVenda salvar(ItensPedidoVenda ItensPedidoVenda);
	public void excluir(ItensPedidoVenda ItensPedidoVenda);
	public Optional<ItensPedidoVenda> findItensPedidoVenda(Long id);
	public List<ItensPedidoVenda> listaItensPedidoVendas();



}


